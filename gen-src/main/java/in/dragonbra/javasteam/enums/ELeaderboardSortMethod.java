package in.dragonbra.javasteam.enums;


public enum ELeaderboardSortMethod {

    None(0),

    Ascending(1),

    Descending(2),

    ;

    private final int code;

    ELeaderboardSortMethod(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELeaderboardSortMethod from(int code) {
        for (ELeaderboardSortMethod e : ELeaderboardSortMethod.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
