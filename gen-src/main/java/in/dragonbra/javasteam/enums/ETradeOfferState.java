package in.dragonbra.javasteam.enums;


public enum ETradeOfferState {

    Invalid(1),

    Active(2),

    Accepted(3),

    Countered(4),

    Expired(5),

    Canceled(6),

    Declined(7),

    InvalidItems(8),

    CreatedNeedsConfirmation(9),

    CanceledBySecondFactor(10),

    InEscrow(11),

    ;

    private final int code;

    ETradeOfferState(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ETradeOfferState from(int code) {
        for (ETradeOfferState e : ETradeOfferState.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
