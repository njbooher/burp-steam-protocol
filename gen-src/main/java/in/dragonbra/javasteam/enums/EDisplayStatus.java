package in.dragonbra.javasteam.enums;


public enum EDisplayStatus {

    Invalid(0),

    Launching(1),

    Uninstalling(2),

    Installing(3),

    Running(4),

    Validating(5),

    Updating(6),

    Downloading(7),

    Synchronizing(8),

    ReadyToInstall(9),

    ReadyToPreload(10),

    ReadyToLaunch(11),

    RegionRestricted(12),

    PresaleOnly(13),

    InvalidPlatform(14),

    ParentalBlocked(15),

    PreloadOnly(16),

    BorrowerLocked(17),

    UpdatePaused(18),

    UpdateQueued(19),

    UpdateRequired(20),

    UpdateDisabled(21),

    DownloadPaused(22),

    DownloadQueued(23),

    DownloadRequired(24),

    DownloadDisabled(25),

    LicensePending(26),

    LicenseExpired(27),

    AvailForFree(28),

    AvailToBorrow(29),

    AvailGuestPass(30),

    Purchase(31),

    Unavailable(32),

    NotLaunchable(33),

    CloudError(34),

    CloudOutOfDate(35),

    Terminating(36),

    ;

    private final int code;

    EDisplayStatus(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EDisplayStatus from(int code) {
        for (EDisplayStatus e : EDisplayStatus.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
