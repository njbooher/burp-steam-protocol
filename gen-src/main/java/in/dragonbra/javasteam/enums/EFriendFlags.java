package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EFriendFlags {

    None(0),

    Blocked(1),

    FriendshipRequested(2),

    Immediate(4),

    ClanMember(8),

    OnGameServer(16),

    RequestingFriendship(128),

    RequestingInfo(256),

    Ignored(512),

    IgnoredFriend(1024),

    Suggested(2048),

    ChatMember(4096),

    FlagAll(65535),

    ;

    private final int code;

    EFriendFlags(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EFriendFlags> from(int code) {
        EnumSet<EFriendFlags> set = EnumSet.noneOf(EFriendFlags.class);
        for (EFriendFlags e : EFriendFlags.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EFriendFlags> flags) {
        int code = 0;
        for (EFriendFlags flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
