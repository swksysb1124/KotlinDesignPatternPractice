package org.example.creational.singleton

enum class RegistryEnum {
    INSTANCE;

    fun operation1() {
        // Implementation of operation1
    }

    companion object {
        fun getInstance(): RegistryEnum {
            return INSTANCE
        }
    }
}

fun main() {
    val instance = RegistryEnum.getInstance()
    val instance2 = RegistryEnum.getInstance()
    val instance3 = RegistryEnum.getInstance()
    val instance4 = RegistryEnum.getInstance()
    println(instance === instance2) // true
    println(instance2 === instance3) // true
    println(instance3 === instance4) // true
}