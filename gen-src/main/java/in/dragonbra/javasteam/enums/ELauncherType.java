package in.dragonbra.javasteam.enums;


public enum ELauncherType {

    Default(0),

    PerfectWorld(1),

    Nexon(2),

    CmdLine(3),

    CSGO(4),

    ClientUI(5),

    Headless(6),

    SteamChina(7),

    SingleApp(8),

    GameServer(9),

    ;

    private final int code;

    ELauncherType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELauncherType from(int code) {
        for (ELauncherType e : ELauncherType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
