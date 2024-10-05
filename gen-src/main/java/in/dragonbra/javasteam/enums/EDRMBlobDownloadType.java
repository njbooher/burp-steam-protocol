package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EDRMBlobDownloadType {

    Error(0),

    File(1),

    Parts(2),

    Compressed(4),

    AllMask(7),

    IsJob(8),

    HighPriority(16),

    AddTimestamp(32),

    LowPriority(64),

    ;

    private final int code;

    EDRMBlobDownloadType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EDRMBlobDownloadType> from(int code) {
        EnumSet<EDRMBlobDownloadType> set = EnumSet.noneOf(EDRMBlobDownloadType.class);
        for (EDRMBlobDownloadType e : EDRMBlobDownloadType.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EDRMBlobDownloadType> flags) {
        int code = 0;
        for (EDRMBlobDownloadType flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
