package in.dragonbra.javasteam.enums;


public enum ESteamRealm {

    Unknown(0),

    SteamGlobal(1),

    SteamChina(2),

    ;

    private final int code;

    ESteamRealm(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ESteamRealm from(int code) {
        for (ESteamRealm e : ESteamRealm.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
