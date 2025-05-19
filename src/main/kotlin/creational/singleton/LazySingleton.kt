package org.example.creational.singleton

class LazySingleton private constructor() {
    companion object {
        @Volatile
        private var INSTANCE: LazySingleton? = null

        fun getInstance(): LazySingleton {
            return INSTANCE ?: synchronized(LazySingleton::class) {
                INSTANCE ?: LazySingleton().also {
                    INSTANCE = it
                }
            }
        }
    }
}