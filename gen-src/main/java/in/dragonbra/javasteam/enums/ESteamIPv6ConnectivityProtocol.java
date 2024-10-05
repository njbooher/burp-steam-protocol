package in.dragonbra.javasteam.enums;


public enum ESteamIPv6ConnectivityProtocol {

    Invalid(0),

    Http(1),

    Udp(2),

    ;

    private final int code;

    ESteamIPv6ConnectivityProtocol(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ESteamIPv6ConnectivityProtocol from(int code) {
        for (ESteamIPv6ConnectivityProtocol e : ESteamIPv6ConnectivityProtocol.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
