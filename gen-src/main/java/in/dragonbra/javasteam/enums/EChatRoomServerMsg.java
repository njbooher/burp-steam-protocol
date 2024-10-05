package in.dragonbra.javasteam.enums;


public enum EChatRoomServerMsg {

    Invalid(0),

    RenameChatRoom(1),

    Joined(2),

    Parted(3),

    Kicked(4),

    Invited(5),

    InviteDismissed(8),

    ChatRoomTaglineChanged(9),

    ChatRoomAvatarChanged(10),

    AppCustom(11),

    ;

    private final int code;

    EChatRoomServerMsg(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomServerMsg from(int code) {
        for (EChatRoomServerMsg e : EChatRoomServerMsg.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
