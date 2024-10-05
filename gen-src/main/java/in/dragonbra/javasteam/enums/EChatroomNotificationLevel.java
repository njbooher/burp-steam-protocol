package in.dragonbra.javasteam.enums;


public enum EChatroomNotificationLevel {

    Invalid(0),

    None(1),

    MentionMe(2),

    MentionAll(3),

    AllMessages(4),

    ;

    private final int code;

    EChatroomNotificationLevel(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatroomNotificationLevel from(int code) {
        for (EChatroomNotificationLevel e : EChatroomNotificationLevel.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
