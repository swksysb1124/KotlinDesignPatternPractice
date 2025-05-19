package org.example.creational.singleton

class LazyRegistryIODH private constructor() {

    private class RegisterHolder {
        companion object {
            val INSTANCE = LazyRegistryIODH()
        }
    }

    companion object {
        fun getInstance(): LazyRegistryIODH {
            return RegisterHolder.INSTANCE
        }
    }
}