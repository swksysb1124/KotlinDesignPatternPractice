package org.example.creational.abstractfactory.instance

import org.example.creational.abstractfactory.storage.Storage

interface Instance {
    fun attachStorage(storage: Storage)

    fun start()

    fun stop()

    enum class Capacity {Micro, Small, Large}
}