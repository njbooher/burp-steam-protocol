package in.dragonbra.javasteam.enums;


public enum EServerType {

    Util(-2),

    Client(-3),

    CServer(-4),

    CEconBase(-5),

    Invalid(-1),

    First(0),

    Shell(0),

    GM(1),

    AM(3),

    BS(4),

    VS(5),

    ATS(6),

    CM(7),

    FBS(8),

    BoxMonitor(9),

    SS(10),

    DRMS(11),

    Console(13),

    PICS(14),

    ContentStats(16),

    DP(17),

    WG(18),

    SM(19),

    SLC(20),

    UFS(21),

    Community(24),

    AppInformation(26),

    Spare(27),

    FTS(28),

    SiteLicense(29),

    PS(30),

    IS(31),

    CCS(32),

    DFS(33),

    LBS(34),

    MDS(35),

    CS(36),

    GC(37),

    NS(38),

    OGS(39),

    WebAPI(40),

    UDS(41),

    MMS(42),

    GMS(43),

    KGS(44),

    UCM(45),

    RM(46),

    FS(47),

    Econ(48),

    Backpack(49),

    UGS(50),

    StoreFeature(51),

    MoneyStats(52),

    CRE(53),

    UMQ(54),

    Workshop(55),

    BRP(56),

    GCH(57),

    MPAS(58),

    Trade(59),

    Secrets(60),

    Logsink(61),

    Market(62),

    Quest(63),

    WDS(64),

    ACS(65),

    PNP(66),

    TaxForm(67),

    ExternalMonitor(68),

    Parental(69),

    PartnerUpload(70),

    Partner(71),

    ES(72),

    DepotWebContent(73),

    ExternalConfig(74),

    GameNotifications(75),

    MarketRepl(76),

    MarketSearch(77),

    Localization(78),

    Steam2Emulator(79),

    PublicTest(80),

    SolrMgr(81),

    BroadcastIngestor(82),

    BroadcastDirectory(83),

    VideoManager(84),

    TradeOffer(85),

    BroadcastChat(86),

    Phone(87),

    AccountScore(88),

    Support(89),

    LogRequest(90),

    LogWorker(91),

    EmailDelivery(92),

    InventoryManagement(93),

    Auth(94),

    StoreCatalog(95),

    HLTVRelay(96),

    IDLS(97),

    Perf(98),

    ItemInventory(99),

    Watchdog(100),

    AccountHistory(101),

    Chat(102),

    Shader(103),

    AccountHardware(104),

    WebRTC(105),

    Giveaway(106),

    ChatRoom(107),

    VoiceChat(108),

    QMS(109),

    Trust(110),

    TimeMachine(111),

    VACDBMaster(112),

    ContentServerConfig(113),

    Minigame(114),

    MLTrain(115),

    VACTest(116),

    TaxService(117),

    MLInference(118),

    UGSAggregate(119),

    TURN(120),

    RemoteClient(121),

    BroadcastOrigin(122),

    BroadcastChannel(123),

    SteamAR(124),

    China(125),

    CrashDump(126),

    ;

    private final int code;

    EServerType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EServerType from(int code) {
        for (EServerType e : EServerType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
