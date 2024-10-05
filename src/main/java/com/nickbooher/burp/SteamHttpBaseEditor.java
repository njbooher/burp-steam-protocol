package com.nickbooher.burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.params.HttpParameterType;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.RawEditor;
import com.google.protobuf.util.JsonFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.awt.*;

public class SteamHttpBaseEditor {

    protected RawEditor messageEditor;
    protected MontoyaApi api;
    protected HttpRequestResponse requestResponse;
    protected boolean isPost;

    protected String umInterface;
    protected String umMethod;

    protected Pattern umMatchPattern;

    protected JsonFormat.Printer protoJsonPrinter;
    protected JsonFormat.Parser protoJsonParser;

    SteamHttpBaseEditor(MontoyaApi api) {
        this.api = api;
        this.umMatchPattern = Pattern.compile("^/I([A-Za-z0-9]+)Service/([A-Za-z0-9]+)/v");
        this.protoJsonParser= JsonFormat.parser();
        this.protoJsonPrinter = JsonFormat.printer().preservingProtoFieldNames();
    }

    public boolean isEnabledFor(HttpRequestResponse requestResponse) {
        String requestHost = requestResponse.request().headerValue("Host");
        boolean isAPIServer = requestHost.equals("api.steampowered.com") || requestHost.endsWith(".steam-api.com");
        boolean hasProtoURLParam = requestResponse.request().hasParameter("input_protobuf_encoded", HttpParameterType.URL);
        boolean hasProtoBodyParam = requestResponse.request().hasParameter("input_protobuf_encoded", HttpParameterType.BODY);
        return isAPIServer && (hasProtoURLParam || hasProtoBodyParam);
    }

    public String caption() {
        return "SteamProtocol";
    }

    public Component uiComponent() {
        return messageEditor.uiComponent();
    }

    public Selection selectedData() {
        if (messageEditor.selection().isPresent()) {
            return messageEditor.selection().get();
        } else {
            return null;
        }
    }

    public boolean isModified() {
        return messageEditor.isModified();
    }

    protected void setUMInterfaceAndMethod() {
        String pathWithoutQuery = this.requestResponse.request().pathWithoutQuery();
        //this.api.logging().logToOutput(pathWithoutQuery);
        Matcher matcher = this.umMatchPattern.matcher(pathWithoutQuery);
        if (matcher.find()) {
            this.umInterface = matcher.group(1);
            //this.api.logging().logToOutput(this.umInterface);
            this.umMethod = matcher.group(2);
            //this.api.logging().logToOutput(this.umMethod);
        } else {
            this.api.logging().logToError("setUMInterfaceAndMethod: Unable to split request path into interface and method");
        }
    }
}
