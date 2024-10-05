package in.dragonbra.javasteam.enums;


public enum EWorkshopFileAction {

    Played(0),

    Completed(1),

    ;

    private final int code;

    EWorkshopFileAction(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EWorkshopFileAction from(int code) {
        for (EWorkshopFileAction e : EWorkshopFileAction.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
