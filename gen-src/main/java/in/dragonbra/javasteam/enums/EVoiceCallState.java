package in.dragonbra.javasteam.enums;


public enum EVoiceCallState {

    None(0),

    ScheduledInitiate(1),

    RequestedMicAccess(2),

    LocalMicOnly(3),

    CreatePeerConnection(4),

    InitatedWebRTCSession(5),

    WebRTCConnectedWaitingOnIceConnected(6),

    RequestedPermission(7),

    NotifyingVoiceChatOfWebRTCSession(8),

    Connected(9),

    ;

    private final int code;

    EVoiceCallState(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EVoiceCallState from(int code) {
        for (EVoiceCallState e : EVoiceCallState.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
