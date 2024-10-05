package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EUCMFilePrivacyState {

    Invalid(-1),

    Private(2),

    FriendsOnly(4),

    Public(8),

    Unlisted(16),

    ;

    public static final EnumSet<EUCMFilePrivacyState> All = EnumSet.of(Public, FriendsOnly, Private, Unlisted);

    private final int code;

    EUCMFilePrivacyState(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EUCMFilePrivacyState> from(int code) {
        EnumSet<EUCMFilePrivacyState> set = EnumSet.noneOf(EUCMFilePrivacyState.class);
        for (EUCMFilePrivacyState e : EUCMFilePrivacyState.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EUCMFilePrivacyState> flags) {
        int code = 0;
        for (EUCMFilePrivacyState flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
