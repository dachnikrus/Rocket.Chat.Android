package chat.rocket.android.chatroom.uimodel

import chat.rocket.android.R
import chat.rocket.core.model.Message
import chat.rocket.core.model.attachment.ColorAttachment

data class ColorAttachmentUiModel(
        override val attachmentUrl: String,
        val id: Long,
        val color: Int,
        val text: CharSequence,
        override val message: Message,
        override val rawData: ColorAttachment,
        override val messageId: String,
        override var reactions: List<ReactionUiModel>,
        override var nextDownStreamMessage: BaseUiModel<*>? = null,
        override var preview: Message? = null,
        override var isTemporary: Boolean = false
) : BaseAttachmentUiModel<ColorAttachment> {
    override val viewType: Int
        get() = BaseUiModel.ViewType.COLOR_ATTACHMENT.viewType
    override val layoutId: Int
        get() = R.layout.item_color_attachment
}