package org.example.creational.factorymethod

abstract class MessageCreator {
    abstract fun createMessage(): Message
}

class JSONMessageCreator: MessageCreator() {
    override fun createMessage() = JSONMessage()
}

class TextMessageCreator: MessageCreator() {
    override fun createMessage() = TextMessage()
}