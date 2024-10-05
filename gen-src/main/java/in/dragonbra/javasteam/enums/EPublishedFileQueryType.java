package in.dragonbra.javasteam.enums;


public enum EPublishedFileQueryType {

    RankedByVote(0),

    RankedByPublicationDate(1),

    AcceptedForGameRankedByAcceptanceDate(2),

    RankedByTrend(3),

    FavoritedByFriendsRankedByPublicationDate(4),

    CreatedByFriendsRankedByPublicationDate(5),

    RankedByNumTimesReported(6),

    CreatedByFollowedUsersRankedByPublicationDate(7),

    NotYetRated(8),

    RankedByTotalUniqueSubscriptions(9),

    RankedByTotalVotesAsc(10),

    RankedByVotesUp(11),

    RankedByTextSearch(12),

    RankedByPlaytimeTrend(13),

    RankedByTotalPlaytime(14),

    RankedByAveragePlaytimeTrend(15),

    RankedByLifetimeAveragePlaytime(16),

    RankedByPlaytimeSessionsTrend(17),

    RankedByLifetimePlaytimeSessions(18),

    RankedByInappropriateContentRating(19),

    ;

    private final int code;

    EPublishedFileQueryType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPublishedFileQueryType from(int code) {
        for (EPublishedFileQueryType e : EPublishedFileQueryType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
