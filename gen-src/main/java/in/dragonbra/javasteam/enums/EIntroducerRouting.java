package in.dragonbra.javasteam.enums;


public enum EIntroducerRouting {

    P2PVoiceChat(1),

    P2PNetworking(2),

    ;

    private final int code;

    EIntroducerRouting(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EIntroducerRouting from(int code) {
        for (EIntroducerRouting e : EIntroducerRouting.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
