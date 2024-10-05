package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EClanPermission {

    Nobody(0),

    Owner(1),

    Officer(2),

    OwnerAndOfficer(3),

    Member(4),

    Moderator(8),

    OGGGameOwner(16),

    NonMember(128),

    ;

    public static final EnumSet<EClanPermission> OwnerOfficerModerator = EnumSet.of(Owner, Officer, Moderator);

    public static final EnumSet<EClanPermission> AllMembers = EnumSet.of(Owner, Officer, Moderator, Member);

    public static final EnumSet<EClanPermission> MemberAllowed = EnumSet.of(NonMember, Member);

    public static final EnumSet<EClanPermission> ModeratorAllowed = EnumSet.of(NonMember, Member, Moderator);

    public static final EnumSet<EClanPermission> OfficerAllowed = EnumSet.of(NonMember, Member, Moderator, Officer);

    public static final EnumSet<EClanPermission> OwnerAllowed = EnumSet.of(NonMember, Member, Moderator, Officer, Owner);

    public static final EnumSet<EClanPermission> Anybody = EnumSet.of(NonMember, Member, Moderator, Officer, Owner);

    private final int code;

    EClanPermission(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EClanPermission> from(int code) {
        EnumSet<EClanPermission> set = EnumSet.noneOf(EClanPermission.class);
        for (EClanPermission e : EClanPermission.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EClanPermission> flags) {
        int code = 0;
        for (EClanPermission flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
