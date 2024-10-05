package in.dragonbra.javasteam.enums;


public enum ELeaderboardUploadScoreMethod {

    None(0),

    KeepBest(1),

    ForceUpdate(2),

    ;

    private final int code;

    ELeaderboardUploadScoreMethod(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELeaderboardUploadScoreMethod from(int code) {
        for (ELeaderboardUploadScoreMethod e : ELeaderboardUploadScoreMethod.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
