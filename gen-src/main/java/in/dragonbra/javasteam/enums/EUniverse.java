package in.dragonbra.javasteam.enums;


public enum EUniverse {

    Invalid(0),

    Public(1),

    Beta(2),

    Internal(3),

    Dev(4),

    ;

    private final int code;

    EUniverse(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EUniverse from(int code) {
        for (EUniverse e : EUniverse.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
