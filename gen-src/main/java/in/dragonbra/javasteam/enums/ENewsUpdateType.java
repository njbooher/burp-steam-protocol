package in.dragonbra.javasteam.enums;


public enum ENewsUpdateType {

    AppNews(0),

    SteamAds(1),

    SteamNews(2),

    CDDBUpdate(3),

    ClientUpdate(4),

    ;

    private final int code;

    ENewsUpdateType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ENewsUpdateType from(int code) {
        for (ENewsUpdateType e : ENewsUpdateType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
