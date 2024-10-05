package in.dragonbra.javasteam.enums;


public enum ELobbyType {

    Private(0),

    FriendsOnly(1),

    Public(2),

    Invisible(3),

    PrivateUnique(4),

    ;

    private final int code;

    ELobbyType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELobbyType from(int code) {
        for (ELobbyType e : ELobbyType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
