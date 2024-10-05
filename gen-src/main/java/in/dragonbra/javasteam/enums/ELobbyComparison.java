package in.dragonbra.javasteam.enums;


public enum ELobbyComparison {

    EqualToOrLessThan(-2),

    LessThan(-1),

    Equal(0),

    GreaterThan(1),

    EqualToOrGreaterThan(2),

    NotEqual(3),

    ;

    private final int code;

    ELobbyComparison(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELobbyComparison from(int code) {
        for (ELobbyComparison e : ELobbyComparison.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
