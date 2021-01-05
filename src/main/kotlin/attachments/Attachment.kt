package attachments

sealed class Attachment {
    abstract val type: String
}

class GraffitiAttachment : Attachment() {
    override val type: String = "graffiti"
    val graffiti: Graffiti = Graffiti()
}

class AudioAttachment : Attachment() {
    override val type: String = "audio"
    val audio: Audio = Audio()
}

class DocAttachment : Attachment() {
    override val type: String = "Doc"
    val doc: Doc = Doc()
}

class VideoAttachment : Attachment() {
    override val type = "Video"
    val video: Video = Video()
}

class PhotoAttachment : Attachment() {
    override val type = "Photo"
    val photo: Photo = Photo()
}