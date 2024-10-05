package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EClientPersonaStateFlag {

    Status(1),

    PlayerName(2),

    QueryPort(4),

    SourceID(8),

    Presence(16),

    LastSeen(64),

    UserClanRank(128),

    GameExtraInfo(256),

    GameDataBlob(512),

    ClanData(1024),

    Facebook(2048),

    RichPresence(4096),

    Broadcast(8192),

    Watching(16384),

    ;

    private final int code;

    EClientPersonaStateFlag(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EClientPersonaStateFlag> from(int code) {
        EnumSet<EClientPersonaStateFlag> set = EnumSet.noneOf(EClientPersonaStateFlag.class);
        for (EClientPersonaStateFlag e : EClientPersonaStateFlag.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EClientPersonaStateFlag> flags) {
        int code = 0;
        for (EClientPersonaStateFlag flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
