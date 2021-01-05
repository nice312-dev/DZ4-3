package attachments

class Doc (
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val size: Int = 0,
    val ext: String? = null,
    val url: String? = null,
    val date: Int? = null
)