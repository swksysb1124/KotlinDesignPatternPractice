package org.example.structural.decorator


import org.apache.commons.text.StringEscapeUtils
import java.util.Base64

// Decorator
class Base64EncodedMessage(
    private val message: Message
) : Message {
    override fun getContent(): String {
        val encoder = Base64.getEncoder()
        return encoder.encodeToString(
            message.getContent().toByteArray()
        )
    }
}

// Decorator
class HtmlEncodedMessage(
    private val message: Message
) : Message {
    override fun getContent(): String {
        return StringEscapeUtils.escapeHtml4(message.getContent())
    }
}