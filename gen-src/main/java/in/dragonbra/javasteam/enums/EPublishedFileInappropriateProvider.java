package in.dragonbra.javasteam.enums;


public enum EPublishedFileInappropriateProvider {

    Invalid(0),

    Google(1),

    Amazon(2),

    ;

    private final int code;

    EPublishedFileInappropriateProvider(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPublishedFileInappropriateProvider from(int code) {
        for (EPublishedFileInappropriateProvider e : EPublishedFileInappropriateProvider.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
