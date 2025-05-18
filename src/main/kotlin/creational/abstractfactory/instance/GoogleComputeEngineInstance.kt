package org.example.creational.abstractfactory.instance

import org.example.creational.abstractfactory.storage.Storage

class GoogleComputeEngineInstance(capacity: Instance.Capacity): Instance {

    init {
        println("Created Google Compute Engine instance with $capacity")
    }

    override fun attachStorage(storage: Storage) {
        println("Attached $storage to Compute engine instance")
    }

    override fun start() {
        println("Compute engine started")
    }

    override fun stop() {
        println("Compute engine stopped")
    }
}