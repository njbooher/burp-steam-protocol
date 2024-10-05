package in.dragonbra.javasteam.enums;


public enum EFriendRelationship {

    None(0),

    Blocked(1),

    RequestRecipient(2),

    Friend(3),

    RequestInitiator(4),

    Ignored(5),

    IgnoredFriend(6),

    ;

    private final int code;

    EFriendRelationship(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EFriendRelationship from(int code) {
        for (EFriendRelationship e : EFriendRelationship.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
