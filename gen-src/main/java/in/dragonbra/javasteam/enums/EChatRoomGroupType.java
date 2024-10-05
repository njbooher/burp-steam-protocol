package in.dragonbra.javasteam.enums;


public enum EChatRoomGroupType {

    Default(0),

    Unmoderated(1),

    ;

    private final int code;

    EChatRoomGroupType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomGroupType from(int code) {
        for (EChatRoomGroupType e : EChatRoomGroupType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
