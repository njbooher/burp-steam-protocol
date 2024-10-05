package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum ERemoteStoragePlatform {

    None(0),

    Windows(1),

    OSX(2),

    PS3(4),

    Linux(8),

    Switch(16),

    Android(32),

    IPhoneOS(64),

    All(-1),

    ;

    private final int code;

    ERemoteStoragePlatform(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<ERemoteStoragePlatform> from(int code) {
        EnumSet<ERemoteStoragePlatform> set = EnumSet.noneOf(ERemoteStoragePlatform.class);
        for (ERemoteStoragePlatform e : ERemoteStoragePlatform.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<ERemoteStoragePlatform> flags) {
        int code = 0;
        for (ERemoteStoragePlatform flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
