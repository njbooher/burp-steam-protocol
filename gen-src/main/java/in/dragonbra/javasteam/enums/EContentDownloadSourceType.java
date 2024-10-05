package in.dragonbra.javasteam.enums;


public enum EContentDownloadSourceType {

    Invalid(0),

    CS(1),

    CDN(2),

    LCS(3),

    ProxyCache(4),

    LANPeer(5),

    SLS(6),

    SteamCache(7),

    OpenCache(8),

    LANCache(9),

    ;

    private final int code;

    EContentDownloadSourceType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EContentDownloadSourceType from(int code) {
        for (EContentDownloadSourceType e : EContentDownloadSourceType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
