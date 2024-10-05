package in.dragonbra.javasteam.enums;


public enum ELeaderboardDataRequest {

    Global(0),

    GlobalAroundUser(1),

    Friends(2),

    Users(3),

    ;

    private final int code;

    ELeaderboardDataRequest(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELeaderboardDataRequest from(int code) {
        for (ELeaderboardDataRequest e : ELeaderboardDataRequest.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
