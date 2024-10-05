package in.dragonbra.javasteam.enums;


public enum EChatRoomGroupRank {

    Default(0),

    Viewer(10),

    Guest(15),

    Member(20),

    Moderator(30),

    Officer(40),

    Owner(50),

    TestInvalid(99),

    ;

    private final int code;

    EChatRoomGroupRank(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomGroupRank from(int code) {
        for (EChatRoomGroupRank e : EChatRoomGroupRank.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
