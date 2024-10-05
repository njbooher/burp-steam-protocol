package in.dragonbra.javasteam.enums;


public enum EChatRoomType {

    Friend(1),

    MUC(2),

    Lobby(3),

    ;

    private final int code;

    EChatRoomType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomType from(int code) {
        for (EChatRoomType e : EChatRoomType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
