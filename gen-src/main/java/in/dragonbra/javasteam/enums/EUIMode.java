package in.dragonbra.javasteam.enums;


public enum EUIMode {

    Unknown(-1),

    VGUI(0),

    Tenfoot(1),

    Mobile(2),

    Web(3),

    ClientUI(4),

    MobileChat(5),

    EmbeddedClient(6),

    ;

    private final int code;

    EUIMode(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EUIMode from(int code) {
        for (EUIMode e : EUIMode.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
