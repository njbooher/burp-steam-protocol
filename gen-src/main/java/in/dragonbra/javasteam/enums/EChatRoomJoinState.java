package in.dragonbra.javasteam.enums;


public enum EChatRoomJoinState {

    Default(0),

    None(1),

    Joined(2),

    TestInvalid(99),

    ;

    private final int code;

    EChatRoomJoinState(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomJoinState from(int code) {
        for (EChatRoomJoinState e : EChatRoomJoinState.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
