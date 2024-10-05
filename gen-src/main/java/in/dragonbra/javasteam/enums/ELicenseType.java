package in.dragonbra.javasteam.enums;


public enum ELicenseType {

    NoLicense(0),

    SinglePurchase(1),

    SinglePurchaseLimitedUse(2),

    RecurringCharge(3),

    RecurringChargeLimitedUse(4),

    RecurringChargeLimitedUseWithOverages(5),

    RecurringOption(6),

    LimitedUseDelayedActivation(7),

    ;

    private final int code;

    ELicenseType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static ELicenseType from(int code) {
        for (ELicenseType e : ELicenseType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
