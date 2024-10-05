package in.dragonbra.javasteam.enums;


public enum ETradeOfferConfirmationMethod {

    Invalid(0),

    Email(1),

    MobileApp(2),

    ;

    private final int code;

    ETradeOfferConfirmationMethod(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ETradeOfferConfirmationMethod from(int code) {
        for (ETradeOfferConfirmationMethod e : ETradeOfferConfirmationMethod.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
