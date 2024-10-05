package in.dragonbra.javasteam.enums;


public enum EPlatformType {

    Unknown(0),

    Win32(1),

    Win64(2),

    Linux64(3),

    OSX(4),

    PS3(5),

    Linux32(6),

    ;

    private final int code;

    EPlatformType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPlatformType from(int code) {
        for (EPlatformType e : EPlatformType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
