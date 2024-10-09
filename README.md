# burp-steam-protocol

Friendly Steam protobuf message editor for Burp

Borrows heavily from [JavaSteam](https://github.com/Longi94/JavaSteam), a port of [SteamKit2](https://github.com/SteamRE/SteamKit)

## Current Features

* For requests to the API server
  * Provides an HTTP Request editor tab that transforms `input_protobuf_encoded` into JSON and back
  * Provides an HTTP Response viewer tab that transforms binary protobuf message into JSON

* For WebSocket connections to the CM
  * Provides a message editor tab that transforms Steam unified messages to JSON and back

