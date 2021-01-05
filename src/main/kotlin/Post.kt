import attachments.Attachment

data class Post(
    val id: Long,
    val ownerId: Int,
    val fromId: Int?,
    val createdBy: Int,
    val date: Int,
    var text: String,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean = false,
    val comments: Comment? = null,
    val copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String = listOf("post", "copy", "reply", "postpone", "suggest").toString(),
    val postSource: PostSource? = null,
    val attachments: Array<Attachment>? = null,
    val geo: Geo? = null,
    val signerId: Int? = null,
    val copyHistory: Array<Post>? = null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut? = null,
    val postponedId: Int? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + ownerId
        result = 31 * result + (fromId ?: 0)
        result = 31 * result + createdBy
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + (replyOwnerId ?: 0)
        result = 31 * result + (replyPostId ?: 0)
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + (comments?.hashCode() ?: 0)
        result = 31 * result + (copyright?.hashCode() ?: 0)
        result = 31 * result + (likes?.hashCode() ?: 0)
        result = 31 * result + (reposts?.hashCode() ?: 0)
        result = 31 * result + (views?.hashCode() ?: 0)
        result = 31 * result + postType.hashCode()
        result = 31 * result + (postSource?.hashCode() ?: 0)
        result = 31 * result + (attachments?.hashCode() ?: 0)
        result = 31 * result + (geo?.hashCode() ?: 0)
        result = 31 * result + (signerId ?: 0)
        result = 31 * result + (copyHistory?.contentHashCode() ?: 0)
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + (donut?.hashCode() ?: 0)
        result = 31 * result + (postponedId ?: 0)
        return result
    }
}