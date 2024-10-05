package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EChatFlags {

    Locked(1),

    InvisibleToFriends(2),

    Moderated(4),

    Unjoinable(8),

    ;

    private final int code;

    EChatFlags(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EChatFlags> from(int code) {
        EnumSet<EChatFlags> set = EnumSet.noneOf(EChatFlags.class);
        for (EChatFlags e : EChatFlags.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EChatFlags> flags) {
        int code = 0;
        for (EChatFlags flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
