package in.dragonbra.javasteam.enums;


public enum ELeaderboardDisplayType {

    None(0),

    Numeric(1),

    TimeSeconds(2),

    TimeMilliSeconds(3),

    ;

    private final int code;

    ELeaderboardDisplayType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELeaderboardDisplayType from(int code) {
        for (ELeaderboardDisplayType e : ELeaderboardDisplayType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
