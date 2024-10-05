package in.dragonbra.javasteam.enums;


public enum EPackageStatus {

    Available(0),

    Preorder(1),

    Unavailable(2),

    Invalid(3),

    ;

    private final int code;

    EPackageStatus(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPackageStatus from(int code) {
        for (EPackageStatus e : EPackageStatus.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
