package in.dragonbra.javasteam.enums;


public enum EClientStatAggregateMethod {

    LatestOnly(0),

    Sum(1),

    Event(2),

    Scalar(3),

    ;

    private final int code;

    EClientStatAggregateMethod(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EClientStatAggregateMethod from(int code) {
        for (EClientStatAggregateMethod e : EClientStatAggregateMethod.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
