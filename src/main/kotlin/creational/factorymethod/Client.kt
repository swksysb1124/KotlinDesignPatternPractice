package org.example.creational.factorymethod

fun main() {
    printMessage(JSONMessageCreator())
    printMessage(TextMessageCreator ())
}

fun printMessage(creator: MessageCreator) {
    val msg = creator.createMessage()
    println(msg.getContent())
}