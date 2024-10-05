package in.dragonbra.javasteam.enums;


public enum EChatEntryType {

    Invalid(0),

    ChatMsg(1),

    Typing(2),

    InviteGame(3),

    LeftConversation(6),

    Entered(7),

    WasKicked(8),

    WasBanned(9),

    Disconnected(10),

    HistoricalChat(11),

    Reserved1(12),

    Reserved2(13),

    LinkBlocked(14),

    ;

    private final int code;

    EChatEntryType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatEntryType from(int code) {
        for (EChatEntryType e : EChatEntryType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
