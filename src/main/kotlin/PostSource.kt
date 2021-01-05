class PostSource (
    val type: String = listOf("vk", "widget", "api", "rss", "sms").toString(),
    val platform: String? = listOf("android", "iphone", "wphone").toString(),
    val data: String? = listOf("profile_activity", "profile_photo", "comments", "like", "poll").toString(),
    val url: String?
)