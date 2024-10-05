package com.nickbooher.burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.HttpParameterType;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.ui.editor.EditorOptions;
import burp.api.montoya.ui.editor.extension.EditorCreationContext;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpRequestEditor;
import burp.api.montoya.utilities.Base64DecodingOptions;
import burp.api.montoya.utilities.Base64EncodingOptions;
import burp.api.montoya.utilities.Base64Utils;
import burp.api.montoya.utilities.URLUtils;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.nickbooher.steam.util.msg.UnifiedMessagesUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class SteamHttpRequestEditor extends SteamHttpBaseEditor implements ExtensionProvidedHttpRequestEditor {

    Base64Utils base64Utils;
    URLUtils urlUtils;

    Class<? extends AbstractMessage> requestProtoClass;

    SteamHttpRequestEditor(MontoyaApi api, EditorCreationContext creationContext) {

        super(api);

        this.base64Utils = api.utilities().base64Utils();
        this.urlUtils = api.utilities().urlUtils();

        if (creationContext.editorMode() == EditorMode.READ_ONLY) {
            messageEditor = api.userInterface().createRawEditor(EditorOptions.READ_ONLY);
        } else {
            messageEditor = api.userInterface().createRawEditor();
        }

    }

    @Override
    public HttpRequest getRequest() {
        // purpose of this method is for burp to fetch the contents of messageEditor in a format it understands
        String editorContents = messageEditor.getContents().toString();

        try {
            Message.Builder requestProtoBuilder = (Message.Builder) this.requestProtoClass.getMethod("newBuilder").invoke(null);
            protoJsonParser.merge(editorContents, requestProtoBuilder);
            String newInputProtobufEncodedValue = String.valueOf(urlUtils.encode(base64Utils.encode(ByteArray.byteArray(requestProtoBuilder.build().toByteArray()), Base64EncodingOptions.URL)));
            if (this.isPost) {
                return this.requestResponse.request().withParameter(HttpParameter.bodyParameter("input_protobuf_encoded", newInputProtobufEncodedValue));
            } else {
                return this.requestResponse.request().withParameter(HttpParameter.urlParameter("input_protobuf_encoded", newInputProtobufEncodedValue));
            }
        } catch (IOException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            api.logging().logToError("error encoding input_protobuf_encoded", e);
        }

        return null;
    }

    @Override
    public void setRequestResponse(HttpRequestResponse requestResponse) {
        this.requestResponse = requestResponse;
        this.isPost = requestResponse.request().method().equals("POST");
        this.setUMInterfaceAndMethod();

        String b64EncodedProtobuf;
        ByteArray rawProtobuf;

        if (this.isPost) {
            b64EncodedProtobuf = requestResponse.request().parameterValue("input_protobuf_encoded", HttpParameterType.BODY);
            rawProtobuf = base64Utils.decode(urlUtils.decode(b64EncodedProtobuf));
        } else {
            b64EncodedProtobuf = requestResponse.request().parameterValue("input_protobuf_encoded", HttpParameterType.URL);
            rawProtobuf = base64Utils.decode(urlUtils.decode(b64EncodedProtobuf), Base64DecodingOptions.URL);
        }

        this.requestProtoClass = UnifiedMessagesUtil.getUMRequestProto(this.umInterface + "." + this.umMethod + "#1");

        try {

            MessageOrBuilder requestProto = (MessageOrBuilder) requestProtoClass.getMethod("parseFrom", byte[].class).invoke(null, rawProtobuf.getBytes());
            String editorContents = protoJsonPrinter.print(requestProto);
            messageEditor.setContents(ByteArray.byteArray(editorContents));

        } catch (IOException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            api.logging().logToError("error decoding input_protobuf_encoded", e);
        }

    }


}