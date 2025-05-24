package org.example.structural.decorator

fun main() {
    val message = TextMessage("The <FORCE> is strong with this one!")
    printMessageContent(message)

    val htmlBasedMessage = HtmlEncodedMessage(message)
    printMessageContent(htmlBasedMessage)

    val base64EncodedMessage = Base64EncodedMessage(htmlBasedMessage)
    printMessageContent(base64EncodedMessage)
}

private fun printMessageContent(message: Message) {
    println(message.getContent())
}