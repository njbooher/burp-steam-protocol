package in.dragonbra.javasteam.enums;

import java.util.EnumSet;

public enum EAccountFlags {

    NormalUser(0),

    PersonaNameSet(1),

    Unbannable(2),

    PasswordSet(4),

    Support(8),

    Admin(16),

    Supervisor(32),

    AppEditor(64),

    HWIDSet(128),

    PersonalQASet(256),

    VacBeta(512),

    Debug(1024),

    Disabled(2048),

    LimitedUser(4096),

    LimitedUserForce(8192),

    EmailValidated(16384),

    MarketingTreatment(32768),

    OGGInviteOptOut(65536),

    ForcePasswordChange(131072),

    ForceEmailVerification(262144),

    LogonExtraSecurity(524288),

    LogonExtraSecurityDisabled(1048576),

    Steam2MigrationComplete(2097152),

    NeedLogs(4194304),

    Lockdown(8388608),

    MasterAppEditor(16777216),

    BannedFromWebAPI(33554432),

    PartnerMember(67108864),

    GlobalModerator(134217728),

    ParentalSettings(268435456),

    ThirdPartySupport(536870912),

    NeedsSSANextSteamLogon(1073741824),

    ;

    private final int code;

    EAccountFlags(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<EAccountFlags> from(int code) {
        EnumSet<EAccountFlags> set = EnumSet.noneOf(EAccountFlags.class);
        for (EAccountFlags e : EAccountFlags.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<EAccountFlags> flags) {
        int code = 0;
        for (EAccountFlags flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
