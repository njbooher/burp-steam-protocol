package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EMarketingMessageFlags {

    None(0),

    HighPriority(1),

    PlatformWindows(2),

    PlatformMac(4),

    PlatformLinux(8),

    ;

    public static final EnumSet<EMarketingMessageFlags> PlatformRestrictions = EnumSet.of(PlatformWindows, PlatformMac, PlatformLinux);

    private final int code;

    EMarketingMessageFlags(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EMarketingMessageFlags> from(int code) {
        EnumSet<EMarketingMessageFlags> set = EnumSet.noneOf(EMarketingMessageFlags.class);
        for (EMarketingMessageFlags e : EMarketingMessageFlags.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EMarketingMessageFlags> flags) {
        int code = 0;
        for (EMarketingMessageFlags flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
