package in.dragonbra.javasteam.enums;


public enum EAccountType {

    Invalid(0),

    Individual(1),

    Multiseat(2),

    GameServer(3),

    AnonGameServer(4),

    Pending(5),

    ContentServer(6),

    Clan(7),

    Chat(8),

    ConsoleUser(9),

    AnonUser(10),

    ;

    private final int code;

    EAccountType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EAccountType from(int code) {
        for (EAccountType e : EAccountType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
