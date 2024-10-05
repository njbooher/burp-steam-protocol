package in.dragonbra.javasteam.enums;


public enum ESteamIPv6ConnectivityState {

    Unknown(0),

    Good(1),

    Bad(2),

    ;

    private final int code;

    ESteamIPv6ConnectivityState(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ESteamIPv6ConnectivityState from(int code) {
        for (ESteamIPv6ConnectivityState e : ESteamIPv6ConnectivityState.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
