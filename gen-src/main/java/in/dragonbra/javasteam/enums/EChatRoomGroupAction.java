package in.dragonbra.javasteam.enums;


public enum EChatRoomGroupAction {

    Default(0),

    CreateRenameDeleteChannel(1),

    Kick(2),

    Ban(3),

    Invite(4),

    ChangeTaglineAvatarName(5),

    Chat(6),

    ViewHistory(7),

    ChangeGroupRoles(8),

    ChangeUserRoles(9),

    MentionAll(10),

    SetWatchingBroadcast(11),

    ;

    private final int code;

    EChatRoomGroupAction(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatRoomGroupAction from(int code) {
        for (EChatRoomGroupAction e : EChatRoomGroupAction.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
