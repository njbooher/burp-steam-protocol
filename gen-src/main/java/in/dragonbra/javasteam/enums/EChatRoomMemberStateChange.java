package in.dragonbra.javasteam.enums;


public enum EChatRoomMemberStateChange {

    Invalid(0),

    Joined(1),

    Parted(2),

    Kicked(3),

    Invited(4),

    RankChanged(7),

    InviteDismissed(8),

    Muted(9),

    Banned(10),

    RolesChanged(12),

    ;

    private final int code;

    EChatRoomMemberStateChange(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomMemberStateChange from(int code) {
        for (EChatRoomMemberStateChange e : EChatRoomMemberStateChange.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
