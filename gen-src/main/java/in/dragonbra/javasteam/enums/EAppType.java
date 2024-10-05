package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EAppType {

    Invalid(0),

    Game(1),

    Application(2),

    Tool(4),

    Demo(8),

    Deprected(16),

    DLC(32),

    Guide(64),

    Driver(128),

    Config(256),

    Hardware(512),

    Franchise(1024),

    Video(2048),

    Plugin(4096),

    Music(8192),

    Series(16384),

    Comic(32768),

    Beta(65536),

    Shortcut(1073741824),

    ;

    private final int code;

    EAppType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EAppType> from(int code) {
        EnumSet<EAppType> set = EnumSet.noneOf(EAppType.class);
        for (EAppType e : EAppType.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EAppType> flags) {
        int code = 0;
        for (EAppType flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
