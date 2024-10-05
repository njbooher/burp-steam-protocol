package in.dragonbra.javasteam.enums;


public enum EChatRoomEnterResponse {

    Success(1),

    DoesntExist(2),

    NotAllowed(3),

    Full(4),

    Error(5),

    Banned(6),

    Limited(7),

    ClanDisabled(8),

    CommunityBan(9),

    MemberBlockedYou(10),

    YouBlockedMember(11),

    ;

    private final int code;

    EChatRoomEnterResponse(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomEnterResponse from(int code) {
        for (EChatRoomEnterResponse e : EChatRoomEnterResponse.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
