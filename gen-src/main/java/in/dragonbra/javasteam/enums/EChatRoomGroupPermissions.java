package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EChatRoomGroupPermissions {

    Default(0),

    Valid(1),

    CanInvite(2),

    CanKick(4),

    CanBan(8),

    CanAdminChannel(16),

    ;

    private final int code;

    EChatRoomGroupPermissions(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EChatRoomGroupPermissions> from(int code) {
        EnumSet<EChatRoomGroupPermissions> set = EnumSet.noneOf(EChatRoomGroupPermissions.class);
        for (EChatRoomGroupPermissions e : EChatRoomGroupPermissions.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EChatRoomGroupPermissions> flags) {
        int code = 0;
        for (EChatRoomGroupPermissions flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
