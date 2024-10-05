package in.dragonbra.javasteam.enums;


public enum ERegionCode {

    USEast((byte) 0x00),

    USWest((byte) 0x01),

    SouthAmerica((byte) 0x02),

    Europe((byte) 0x03),

    Asia((byte) 0x04),

    Australia((byte) 0x05),

    MiddleEast((byte) 0x06),

    Africa((byte) 0x07),

    World((byte) 0xFF),

    ;

    private final byte code;

    ERegionCode(byte code) {
        this.code = code;
    }

    public byte code() {
        return this.code;
    }

    public static ERegionCode from(byte code) {
        for (ERegionCode e : ERegionCode.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
