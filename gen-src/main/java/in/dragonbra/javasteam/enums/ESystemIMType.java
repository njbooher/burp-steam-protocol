package in.dragonbra.javasteam.enums;


public enum ESystemIMType {

    RawText(0),

    InvalidCard(1),

    RecurringPurchaseFailed(2),

    CardWillExpire(3),

    SubscriptionExpired(4),

    GuestPassReceived(5),

    GuestPassGranted(6),

    GiftRevoked(7),

    SupportMessage(8),

    SupportMessageClearAlert(9),

    ;

    private final int code;

    ESystemIMType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ESystemIMType from(int code) {
        for (ESystemIMType e : ESystemIMType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
