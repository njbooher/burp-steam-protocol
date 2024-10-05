package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EChatMemberStateChange {

    Entered(0x01),

    Left(0x02),

    Disconnected(0x04),

    Kicked(0x08),

    Banned(0x10),

    VoiceSpeaking(0x1000),

    VoiceDoneSpeaking(0x2000),

    ;

    private final int code;

    EChatMemberStateChange(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EChatMemberStateChange> from(int code) {
        EnumSet<EChatMemberStateChange> set = EnumSet.noneOf(EChatMemberStateChange.class);
        for (EChatMemberStateChange e : EChatMemberStateChange.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EChatMemberStateChange> flags) {
        int code = 0;
        for (EChatMemberStateChange flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
