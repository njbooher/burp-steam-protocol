package in.dragonbra.javasteam.enums;


public enum EPublishedFileInappropriateResult {

    NotScanned(0),

    VeryUnlikely(1),

    Unlikely(30),

    Possible(50),

    Likely(75),

    VeryLikely(100),

    ;

    private final int code;

    EPublishedFileInappropriateResult(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPublishedFileInappropriateResult from(int code) {
        for (EPublishedFileInappropriateResult e : EPublishedFileInappropriateResult.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
