package in.dragonbra.javasteam.enums;


public enum ELobbyFilterType {

    String(0),

    Numerical(1),

    SlotsAvailable(2),

    NearValue(3),

    Distance(4),

    ;

    private final int code;

    ELobbyFilterType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELobbyFilterType from(int code) {
        for (ELobbyFilterType e : ELobbyFilterType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
