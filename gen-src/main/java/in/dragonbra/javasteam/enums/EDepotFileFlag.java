package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EDepotFileFlag {

    UserConfig(1),

    VersionedUserConfig(2),

    Encrypted(4),

    ReadOnly(8),

    Hidden(16),

    Executable(32),

    Directory(64),

    CustomExecutable(128),

    InstallScript(256),

    Symlink(512),

    ;

    private final int code;

    EDepotFileFlag(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EDepotFileFlag> from(int code) {
        EnumSet<EDepotFileFlag> set = EnumSet.noneOf(EDepotFileFlag.class);
        for (EDepotFileFlag e : EDepotFileFlag.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EDepotFileFlag> flags) {
        int code = 0;
        for (EDepotFileFlag flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
