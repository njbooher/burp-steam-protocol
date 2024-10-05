package com.nickbooher.burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.editor.EditorOptions;
import burp.api.montoya.ui.editor.extension.EditorCreationContext;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpResponseEditor;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.nickbooher.steam.util.msg.UnifiedMessagesUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class SteamHttpResponseEditor extends SteamHttpBaseEditor implements ExtensionProvidedHttpResponseEditor {

    Class<? extends AbstractMessage> responseProtoClass;

    SteamHttpResponseEditor(MontoyaApi api, EditorCreationContext creationContext) {

        super(api);
        messageEditor = api.userInterface().createRawEditor(EditorOptions.READ_ONLY);

    }

    @Override
    public HttpResponse getResponse() {

        // purpose of this method is for burp to fetch the contents of messageEditor in a format it understands
        String editorContents = messageEditor.getContents().toString();

        try {
            Message.Builder responseProtoBuilder = (Message.Builder) this.responseProtoClass.getMethod("newBuilder").invoke(null);
            protoJsonParser.merge(editorContents, responseProtoBuilder);
            ByteArray newBody = ByteArray.byteArray(responseProtoBuilder.build().toByteArray());
            return this.requestResponse.response().withBody(newBody);
        } catch (IOException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            api.logging().logToError("error encoding input_protobuf_encoded", e);
        }

        return null;
    }

    @Override
    public void setRequestResponse(HttpRequestResponse requestResponse) {

        this.requestResponse = requestResponse;
        this.setUMInterfaceAndMethod();

        this.responseProtoClass = UnifiedMessagesUtil.getUMResponseProto(this.umInterface + "." + this.umMethod + "#1");
        byte[] bodyBytes = this.requestResponse.response().body().getBytes();

        try {

            MessageOrBuilder requestProto = (MessageOrBuilder) responseProtoClass.getMethod("parseFrom", byte[].class).invoke(null, bodyBytes);
            String editorContents = protoJsonPrinter.print(requestProto);
            messageEditor.setContents(ByteArray.byteArray(editorContents));

        } catch (IOException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            api.logging().logToError("error decoding response body", e);
        }
    }

}
