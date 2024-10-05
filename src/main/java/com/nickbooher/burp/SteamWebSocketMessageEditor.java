package com.nickbooher.burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.contextmenu.WebSocketMessage;
import burp.api.montoya.ui.editor.EditorOptions;
import burp.api.montoya.ui.editor.RawEditor;
import burp.api.montoya.ui.editor.extension.EditorCreationContext;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedWebSocketMessageEditor;
import in.dragonbra.javasteam.base.IPacketMsg;
import com.nickbooher.steam.util.msg.JSONUtil;
import com.nickbooher.steam.util.msg.MsgUtil;

import java.awt.*;


class SteamWebSocketMessageEditor implements ExtensionProvidedWebSocketMessageEditor {

    private final RawEditor messageEditor;
    private final MontoyaApi api;

    private ByteArray rawMessage;

    SteamWebSocketMessageEditor(MontoyaApi api, EditorCreationContext creationContext) {
        this.api = api;

        if (creationContext.editorMode() == EditorMode.READ_ONLY) {
            messageEditor = api.userInterface().createRawEditor(EditorOptions.READ_ONLY);
        } else {
            messageEditor = api.userInterface().createRawEditor();
        }
    }

    @Override
    public ByteArray getMessage() {
        // purpose of this method is for burp to fetch the contents of messageEditor in a format it understands
        byte[] editorContents = JSONUtil.fromJSON(messageEditor.getContents().toString());
        return ByteArray.byteArray(editorContents);
    }

    @Override
    public void setMessage(WebSocketMessage message) {
        // purpose of this method is to init/update messageEditor with a new message from burp

        rawMessage = message.payload();
        String editorContents = JSONUtil.toJSON(rawMessage.getBytes());
        messageEditor.setContents(ByteArray.byteArray(editorContents));
    }

    @Override
    public boolean isEnabledFor(WebSocketMessage message) {
        // TODO make this more efficient
        IPacketMsg packetMsg = MsgUtil.getPacketMsg(message.payload().getBytes());
        return packetMsg != null && packetMsg.isProto();
    }

    @Override
    public String caption() {
        return "SteamProtocol";
    }

    @Override
    public Component uiComponent() {
        return messageEditor.uiComponent();
    }

    @Override
    public Selection selectedData() {
        if (messageEditor.selection().isPresent()) {
            return messageEditor.selection().get();
        } else {
            return null;
        }
    }

    @Override
    public boolean isModified() {
        return messageEditor.isModified();
    }


}