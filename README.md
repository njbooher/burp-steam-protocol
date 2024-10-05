# burp-steam-protocol

## Goal
Friendly Steam protobuf message editor for Burp

## Current Features

* For requests to the API server
  * Provides an HTTP Request editor tab that transforms `input_protobuf_encoded` into JSON and back
  * Provides an HTTP Response viewer tab that transforms binary protobuf message into JSON

* For WebSocket connections to the CM
  * Provides a message editor tab that transforms Steam unified messages to JSON and back

Borrows heavily from:
* https://github.com/Longi94/JavaSteam
