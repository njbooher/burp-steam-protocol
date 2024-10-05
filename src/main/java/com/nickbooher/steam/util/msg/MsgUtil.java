package com.nickbooher.steam.util.msg;

import in.dragonbra.javasteam.enums.EMsg;
import in.dragonbra.javasteam.util.log.LogManager;
import in.dragonbra.javasteam.util.log.Logger;
import in.dragonbra.javasteam.util.stream.BinaryReader;
import in.dragonbra.javasteam.base.IPacketMsg;
import in.dragonbra.javasteam.base.PacketClientMsg;
import in.dragonbra.javasteam.base.PacketClientMsgProtobuf;
import in.dragonbra.javasteam.base.PacketMsg;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author lngtr
 * @since 2018-02-21
 */
public class MsgUtil {

    private static final Logger logger = LogManager.getLogger(MsgUtil.class);

    private static final int PROTO_MASK = 0x80000000;
    private static final int EMSG_MASK = ~PROTO_MASK;

    /**
     * Strips off the protobuf message flag and returns an EMsg.
     *
     * @param msg The message number.
     * @return The underlying EMsg.
     */
    public static EMsg getMsg(int msg) {
        return EMsg.from(msg & EMSG_MASK);
    }

    /**
     * Strips off the protobuf message flag and returns an EMsg.
     *
     * @param msg The message number.
     * @return The underlying EMsg.
     */
    public static int getGCMsg(int msg) {
        return msg & EMSG_MASK;
    }

    /**
     * Crafts an EMsg, flagging it if required.
     *
     * @param msg      The EMsg to flag.
     * @param protobuf if set to true, the message is protobuf flagged.
     * @return A crafted EMsg, flagged if requested.
     */
    public static int makeMsg(int msg, boolean protobuf) {
        if (protobuf) {
            return msg | PROTO_MASK;
        }

        return msg;
    }

    /**
     * Crafts an EMsg, flagging it if required.
     *
     * @param msg      The EMsg to flag.
     * @param protobuf if set to <b>true</b>, the message is protobuf flagged.
     * @return A crafted EMsg, flagged if requested
     */
    public static int makeGCMsg(int msg, boolean protobuf) {
        if (protobuf) {
            return msg | PROTO_MASK;
        }
        return msg;
    }

    /**
     * Determines whether message is protobuf flagged.
     *
     * @param msg The message.
     * @return <b>true</b> if this message is protobuf flagged; otherwise, <b>false</b>.
     */
    public static boolean isProtoBuf(int msg) {
        return (msg & 0xffffffffL & (long) PROTO_MASK) > 0;
    }

    public static IPacketMsg getPacketMsg(byte[] data) {
        if (data.length < 4) {
            logger.error("PacketMsg too small to contain a message, was only {0} bytes. Message: 0x{1}");
            return null;
        }

        BinaryReader reader = new BinaryReader(new ByteArrayInputStream(data));

        int rawEMsg = 0;
        try {
            rawEMsg = reader.readInt();
        } catch (IOException e) {
            logger.error("Exception while getting EMsg code", e);
            return null;
        }
        EMsg eMsg = MsgUtil.getMsg(rawEMsg);

        switch (eMsg) {
            case ChannelEncryptRequest:
            case ChannelEncryptResponse:
            case ChannelEncryptResult:
                try {
                    return new PacketMsg(eMsg, data);
                } catch (IOException e) {
                    logger.error("Exception deserializing emsg " + eMsg + " (" + MsgUtil.isProtoBuf(rawEMsg) + ").", e);
                    return null;
                }
        }

        try {
            if (MsgUtil.isProtoBuf(rawEMsg)) {
                return new PacketClientMsgProtobuf(eMsg, data);
            } else {
                return new PacketClientMsg(eMsg, data);
            }
        } catch (IOException e) {
            logger.error("Exception deserializing emsg " + eMsg + " (" + MsgUtil.isProtoBuf(rawEMsg) + ").", e);
            return null;
        }
    }

}
