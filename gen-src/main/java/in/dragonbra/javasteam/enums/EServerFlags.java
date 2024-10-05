package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EServerFlags {

    None(0),

    Active(1),

    Secure(2),

    Dedicated(4),

    Linux(8),

    Passworded(16),

    Private(32),

    ;

    private final int code;

    EServerFlags(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EServerFlags> from(int code) {
        EnumSet<EServerFlags> set = EnumSet.noneOf(EServerFlags.class);
        for (EServerFlags e : EServerFlags.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EServerFlags> flags) {
        int code = 0;
        for (EServerFlags flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
