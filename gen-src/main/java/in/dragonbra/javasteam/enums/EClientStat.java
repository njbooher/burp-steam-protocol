package in.dragonbra.javasteam.enums;


public enum EClientStat {

    P2PConnectionsUDP(0),

    P2PConnectionsRelay(1),

    P2PGameConnections(2),

    P2PVoiceConnections(3),

    BytesDownloaded(4),

    ;

    private final int code;

    EClientStat(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EClientStat from(int code) {
        for (EClientStat e : EClientStat.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
