package in.dragonbra.javasteam.enums;


public enum EPaymentMethod {

    None(0),

    ActivationCode(1),

    CreditCard(2),

    Giropay(3),

    PayPal(4),

    Ideal(5),

    PaySafeCard(6),

    Sofort(7),

    GuestPass(8),

    WebMoney(9),

    MoneyBookers(10),

    AliPay(11),

    Yandex(12),

    Kiosk(13),

    Qiwi(14),

    GameStop(15),

    HardwarePromo(16),

    MoPay(17),

    BoletoBancario(18),

    BoaCompraGold(19),

    BancoDoBrasilOnline(20),

    ItauOnline(21),

    BradescoOnline(22),

    Pagseguro(23),

    VisaBrazil(24),

    AmexBrazil(25),

    Aura(26),

    Hipercard(27),

    MastercardBrazil(28),

    DinersCardBrazil(29),

    AuthorizedDevice(30),

    MOLPoints(31),

    ClickAndBuy(32),

    Beeline(33),

    Konbini(34),

    EClubPoints(35),

    CreditCardJapan(36),

    BankTransferJapan(37),

    PayEasy(38),

    Zong(39),

    CultureVoucher(40),

    BookVoucher(41),

    HappymoneyVoucher(42),

    ConvenientStoreVoucher(43),

    GameVoucher(44),

    Multibanco(45),

    Payshop(46),

    MaestroBoaCompra(47),

    OXXO(48),

    ToditoCash(49),

    Carnet(50),

    SPEI(51),

    ThreePay(52),

    IsBank(53),

    Garanti(54),

    Akbank(55),

    YapiKredi(56),

    Halkbank(57),

    BankAsya(58),

    Finansbank(59),

    DenizBank(60),

    PTT(61),

    CashU(62),

    SantanderRio(63),

    AutoGrant(64),

    WebMoneyJapan(65),

    OneCard(66),

    PSE(67),

    Exito(68),

    Efecty(69),

    Paloto(70),

    PinValidda(71),

    MangirKart(72),

    BancoCreditoDePeru(73),

    BBVAContinental(74),

    SafetyPay(75),

    PagoEfectivo(76),

    Trustly(77),

    UnionPay(78),

    BitCoin(79),

    LicensedSite(80),

    BitCash(81),

    NetCash(82),

    Nanaco(83),

    Tenpay(84),

    WeChat(85),

    CashonDelivery(86),

    CreditCardNodwin(87),

    DebitCardNodwin(88),

    NetBankingNodwin(89),

    CashCardNodwin(90),

    WalletNodwin(91),

    MobileDegica(92),

    Naranja(93),

    Cencosud(94),

    Cabal(95),

    PagoFacil(96),

    Rapipago(97),

    BancoNacionaldeCostaRica(98),

    BancoPoplar(99),

    RedPagos(100),

    SPE(101),

    Multicaja(102),

    RedCompra(103),

    ZiraatBank(104),

    VakiflarBank(105),

    KuveytTurkBank(106),

    EkonomiBank(107),

    Pichincha(108),

    PichinchaCash(109),

    Przelewy24(110),

    Trustpay(111),

    POLi(112),

    MercadoPago(113),

    PayU(114),

    VTCPayWallet(115),

    MrCash(116),

    EPS(117),

    Interac(118),

    VTCPayCards(119),

    VTCPayOnlineBanking(120),

    VisaElectronBoaCompra(121),

    CafeFunded(122),

    OCA(123),

    Lider(124),

    WebMoneySteamCardJapan(125),

    WebMoneySteamCardTopUpJapan(126),

    Toss(127),

    Wallet(128),

    Valve(129),

    MasterComp(130),

    Promotional(131),

    MasterSubscription(134),

    Payco(135),

    MobileWalletJapan(136),

    BoletoFlash(137),

    PIX(138),

    GCash(139),

    KakaoPay(140),

    Dana(141),

    TrueMoney(142),

    TouchnGo(143),

    LinePay(144),

    MerPay(145),

    PayPay(146),

    AlfaClick(147),

    Sberbank(148),

    YooMoney(149),

    Tinkoff(150),

    CashInCIS(151),

    AuPAY(152),

    AliPayHK(153),

    NaverPay(154),

    Linkaja(155),

    ShopeePay(156),

    GrabPay(157),

    PayNow(158),

    OnlineBankingThailand(159),

    CashOptionsThailand(160),

    OEMTicket(256),

    Split(512),

    Complimentary(1024),

    FamilyGroup(1025),

    ;

    private final int code;

    EPaymentMethod(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPaymentMethod from(int code) {
        for (EPaymentMethod e : EPaymentMethod.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
