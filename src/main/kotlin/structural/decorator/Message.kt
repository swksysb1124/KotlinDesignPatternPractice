package org.example.structural.decorator

// Component
interface Message {
    fun getContent(): String
}


// Concrete Component
class TextMessage(private val msg: String): Message {
    override fun getContent(): String {
        return msg
    }
}