package org.example.creational.factorymethod

abstract class Message {
    abstract fun getContent(): String

    fun addDefaultHeader() {}

    fun encrypt() {}
}

class JSONMessage: Message() {
    override fun getContent(): String {
        return "{\"JSON\":[]}"
    }
}

class TextMessage: Message() {
    override fun getContent(): String {
        return "Text"
    }
}
