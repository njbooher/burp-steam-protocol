package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EPersonaStateFlag {

    HasRichPresence(1),

    InJoinableGame(2),

    Golden(4),

    RemotePlayTogether(8),

    ClientTypeWeb(256),

    ClientTypeMobile(512),

    ClientTypeTenfoot(1024),

    ClientTypeVR(2048),

    LaunchTypeGamepad(4096),

    LaunchTypeCompatTool(8192),

    ;

    private final int code;

    EPersonaStateFlag(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EPersonaStateFlag> from(int code) {
        EnumSet<EPersonaStateFlag> set = EnumSet.noneOf(EPersonaStateFlag.class);
        for (EPersonaStateFlag e : EPersonaStateFlag.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EPersonaStateFlag> flags) {
        int code = 0;
        for (EPersonaStateFlag flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
