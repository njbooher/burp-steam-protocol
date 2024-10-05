package in.dragonbra.javasteam.enums;


public enum EChatInfoType {

    StateChange(1),

    InfoUpdate(2),

    MemberLimitChange(3),

    ;

    private final int code;

    EChatInfoType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EChatInfoType from(int code) {
        for (EChatInfoType e : EChatInfoType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
