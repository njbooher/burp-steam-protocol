package in.dragonbra.javasteam.enums;


public enum EPurchaseResultDetail {

    NoDetail(0),

    AVSFailure(1),

    InsufficientFunds(2),

    ContactSupport(3),

    Timeout(4),

    InvalidPackage(5),

    InvalidPaymentMethod(6),

    InvalidData(7),

    OthersInProgress(8),

    AlreadyPurchased(9),

    WrongPrice(10),

    FraudCheckFailed(11),

    CancelledByUser(12),

    RestrictedCountry(13),

    BadActivationCode(14),

    DuplicateActivationCode(15),

    UseOtherPaymentMethod(16),

    UseOtherFunctionSource(17),

    InvalidShippingAddress(18),

    RegionNotSupported(19),

    AcctIsBlocked(20),

    AcctNotVerified(21),

    InvalidAccount(22),

    StoreBillingCountryMismatch(23),

    DoesNotOwnRequiredApp(24),

    CanceledByNewTransaction(25),

    ForceCanceledPending(26),

    FailCurrencyTransProvider(27),

    FailedCyberCafe(28),

    NeedsPreApproval(29),

    PreApprovalDenied(30),

    WalletCurrencyMismatch(31),

    EmailNotValidated(32),

    ExpiredCard(33),

    TransactionExpired(34),

    WouldExceedMaxWallet(35),

    MustLoginPS3AppForPurchase(36),

    CannotShipToPOBox(37),

    InsufficientInventory(38),

    CannotGiftShippedGoods(39),

    CannotShipInternationally(40),

    BillingAgreementCancelled(41),

    InvalidCoupon(42),

    ExpiredCoupon(43),

    AccountLocked(44),

    OtherAbortableInProgress(45),

    ExceededSteamLimit(46),

    OverlappingPackagesInCart(47),

    NoWallet(48),

    NoCachedPaymentMethod(49),

    CannotRedeemCodeFromClient(50),

    PurchaseAmountNoSupportedByProvider(51),

    OverlappingPackagesInPendingTransaction(52),

    RateLimited(53),

    OwnsExcludedApp(54),

    CreditCardBinMismatchesType(55),

    CartValueTooHigh(56),

    BillingAgreementAlreadyExists(57),

    POSACodeNotActivated(58),

    CannotShipToCountry(59),

    HungTransactionCancelled(60),

    PaypalInternalError(61),

    UnknownGlobalCollectError(62),

    InvalidTaxAddress(63),

    PhysicalProductLimitExceeded(64),

    PurchaseCannotBeReplayed(65),

    DelayedCompletion(66),

    BundleTypeCannotBeGifted(67),

    BlockedByUSGov(68),

    ItemsReservedForCommercialUse(69),

    GiftAlreadyOwned(70),

    GiftInvalidForRecipientRegion(71),

    GiftPricingImbalance(72),

    GiftRecipientNotSpecified(73),

    ItemsNotAllowedForCommercialUse(74),

    BusinessStoreCountryCodeMismatch(75),

    UserAssociatedWithManyCafes(76),

    UserNotAssociatedWithCafe(77),

    AddressInvalid(78),

    CreditCardNumberInvalid(79),

    CannotShipToMilitaryPostOffice(80),

    BillingNameInvalidResemblesCreditCard(81),

    PaymentMethodTemporarilyUnavailable(82),

    PaymentMethodNotSupportedForProduct(83),

    ;

    private final int code;

    EPurchaseResultDetail(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPurchaseResultDetail from(int code) {
        for (EPurchaseResultDetail e : EPurchaseResultDetail.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
