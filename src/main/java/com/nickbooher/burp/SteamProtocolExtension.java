package com.nickbooher.burp;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.logging.Logging;
import burp.api.montoya.ui.editor.extension.*;
import in.dragonbra.javasteam.util.log.LogListener;
import in.dragonbra.javasteam.util.log.LogManager;

public class SteamProtocolExtension implements BurpExtension {

    MontoyaApi api;
    Logging logging;

    @Override
    public void initialize(MontoyaApi api) {

        // Save a reference to the MontoyaApi object
        this.api = api;

        // Set the name of the extension
        api.extension().setName("SteamProtocol");

        // api.logging() returns an object that we can use to print messages to stdout and stderr
        this.logging = api.logging();

        LogManager.addListener(new LogListener() {
            @Override
            public void onLog(Class<?> clazz, String message, Throwable throwable) {
                logging.logToOutput(message);
            }

            @Override
            public void onError(Class<?> clazz, String message, Throwable throwable) {
                logging.logToError(message, throwable);
            }
        });

        api.userInterface().registerWebSocketMessageEditorProvider(new WebSocketMessageEditorProvider() {
            @Override
            public ExtensionProvidedWebSocketMessageEditor provideMessageEditor(EditorCreationContext creationContext) {
                return new SteamWebSocketMessageEditor(api, creationContext);
            }
        });

        api.userInterface().registerHttpRequestEditorProvider(new HttpRequestEditorProvider() {
            @Override
            public ExtensionProvidedHttpRequestEditor provideHttpRequestEditor(EditorCreationContext creationContext) {
                return new SteamHttpRequestEditor(api, creationContext);
            }
        });

        api.userInterface().registerHttpResponseEditorProvider(new HttpResponseEditorProvider() {
            @Override
            public ExtensionProvidedHttpResponseEditor provideHttpResponseEditor(EditorCreationContext creationContext) {
                return new SteamHttpResponseEditor(api, creationContext);
            }
        });

        // Print a message to the stdout
        this.logging.logToOutput("*** SteamProtocol loaded ***");

    }
}