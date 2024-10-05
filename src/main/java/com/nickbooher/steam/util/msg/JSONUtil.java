package com.nickbooher.steam.util.msg;

import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.nickbooher.protos.steam.SteamMsgBase;
import in.dragonbra.javasteam.base.AClientMsgProtobuf;
import in.dragonbra.javasteam.base.ClientMsgProtobuf;
import in.dragonbra.javasteam.base.IPacketMsg;
import in.dragonbra.javasteam.enums.EMsg;
import in.dragonbra.javasteam.util.Utils;
import in.dragonbra.javasteam.util.log.LogManager;
import in.dragonbra.javasteam.util.log.Logger;
import in.dragonbra.javasteam.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class JSONUtil {

    private static final Logger logger = LogManager.getLogger(JSONUtil.class);

    public static String toJSON(byte[] data) {
        IPacketMsg packetMsg = MsgUtil.getPacketMsg(data);
        return toJSON(packetMsg);
    }

    public static String toJSON(IPacketMsg packetMsg) {

        JsonObjectNode result = JsonObjectNode.jsonObjectNode();

        if (packetMsg.isProto()) {

            EMsg msgType = packetMsg.getMsgType();

            AClientMsgProtobuf msg = new AClientMsgProtobuf(packetMsg);
            JsonFormat.Printer protoPrinter = JsonFormat.printer().preservingProtoFieldNames();
            try {
                String rawHeader = protoPrinter.print(msg.getProtoHeader());
                result.put("header", JsonNode.jsonNode(rawHeader).asObject());
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
            result.putString("emsg", msgType.toString());

            String jobName = msg.getHeader().getProto().getTargetJobName();

            switch (msgType) {
                case Multi:
                    ClientMsgProtobuf<SteamMsgBase.CMsgMulti.Builder> msgMulti = new ClientMsgProtobuf<>(SteamMsgBase.CMsgMulti.class, packetMsg);
                    //result.putString("header", headerPrinter.print(msgMulti.getProtoHeader()));
                    result.put("body", multiToJSON(msgMulti));

                    break;
                case ServiceMethodResponse:


                    Class<? extends AbstractMessage> responseProtoClass = UnifiedMessagesUtil.getUMResponseProto(jobName);

                    try {
                        ClientMsgProtobuf<?> msgProto = new ClientMsgProtobuf<>(responseProtoClass, packetMsg);
                        String rawBody = protoPrinter.print(msgProto.getBody());
                        result.put("body", JsonNode.jsonNode(rawBody).asObject());
                    } catch (InvalidProtocolBufferException e) {
                        logger.error(e);
                    }

                    break;

                case ServiceMethod:
                case ServiceMethodCallFromClient:
                case ServiceMethodCallFromClientNonAuthed:

                    Class<? extends AbstractMessage> requestProtoClass = UnifiedMessagesUtil.getUMRequestProto(jobName);

                    try {
                        ClientMsgProtobuf<?> msgProto = new ClientMsgProtobuf<>(requestProtoClass, packetMsg);
                        String rawBody = protoPrinter.print(msgProto.getBody());
                        result.put("body", JsonNode.jsonNode(rawBody).asObject());
                    } catch (InvalidProtocolBufferException e) {
                        logger.error(e);
                    }

                    break;
                default:


                    break;
            }


        }

        return result.toJsonString();

    }

    public static JsonNode multiToJSON(ClientMsgProtobuf<SteamMsgBase.CMsgMulti.Builder> msg) {

        JsonArrayNode result = JsonArrayNode.jsonArrayNode();

        byte[] payload = msg.getBody().getMessageBody().toByteArray();

        if (msg.getBody().getSizeUnzipped() > 0) {
            try {
                payload = Utils.gunzip(payload);
            } catch (IOException e) {
                logger.error("gunzip encountered an exception when decompressing.", e);
                return null;
            }

        }

        try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(payload))) {

            while (br.available() > 0) {
                int subSize = br.readInt();
                byte[] subData = br.readBytes(subSize);

                result.add(JsonNode.jsonNode(toJSON(subData)).asObject());

            }

        } catch (IOException e) {
            logger.error("HandleMulti encountered an exception when dispatching.", e);
        }

        return result;

    }

    public static byte[] fromJSON(String strMsg) {

        byte[] result = {};

        JsonObjectNode msg = JsonNode.jsonNode(strMsg).asObject();

        EMsg eMsg = EMsg.valueOf(msg.getString("emsg"));

        if (eMsg == EMsg.ServiceMethodCallFromClient) {

            JsonFormat.Parser jsonParser = JsonFormat.parser();

            JsonObjectNode jsonObjHeader = (JsonObjectNode) msg.get("header");
            String jsonStringHeader = jsonObjHeader.toJsonString();

            JsonObjectNode jsonObjBody = (JsonObjectNode) msg.get("body");
            String jsonStringBody = jsonObjBody.toJsonString();

            String jobName = jsonObjHeader.getString("target_job_name");
            Class<? extends AbstractMessage> requestProtoClass = UnifiedMessagesUtil.getUMRequestProto(jobName);
            ClientMsgProtobuf<?> msgProto = new ClientMsgProtobuf<>(requestProtoClass, eMsg);

            try {
                jsonParser.merge(jsonStringHeader, msgProto.getProtoHeader());
                jsonParser.merge(jsonStringBody, msgProto.getBody());
                result = msgProto.serialize();
            } catch (InvalidProtocolBufferException e) {
                logger.error(e);

            }

        }

        return result;
    }
}
