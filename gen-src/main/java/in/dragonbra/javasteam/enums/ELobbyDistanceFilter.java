package in.dragonbra.javasteam.enums;


public enum ELobbyDistanceFilter {

    Close(0),

    Default(1),

    Far(2),

    Worldwide(3),

    ;

    private final int code;

    ELobbyDistanceFilter(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELobbyDistanceFilter from(int code) {
        for (ELobbyDistanceFilter e : ELobbyDistanceFilter.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
