package in.dragonbra.javasteam.enums;


public enum EUdpPacketType {

    Invalid((byte) 0),

    ChallengeReq((byte) 1),

    Challenge((byte) 2),

    Connect((byte) 3),

    Accept((byte) 4),

    Disconnect((byte) 5),

    Data((byte) 6),

    Datagram((byte) 7),

    Max((byte) 8),

    ;

    private final byte code;

    EUdpPacketType(byte code) {
        this.code = code;
    }

    public byte code() {
        return this.code;
    }

    public static EUdpPacketType from(byte code) {
        for (EUdpPacketType e : EUdpPacketType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
