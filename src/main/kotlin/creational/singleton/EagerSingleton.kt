package org.example.creational.singleton

class EagerSingleton private constructor() {
    companion object {
        private val INSTANCE = EagerSingleton()
        fun getInstance() = INSTANCE
    }
}