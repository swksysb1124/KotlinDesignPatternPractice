package org.example.creational.abstractfactory.instance

import org.example.creational.abstractfactory.storage.Storage

class Ec2Instance(capacity: Instance.Capacity): Instance {

    init {
        println("Created Ec2Instance with capacity $capacity")
    }

    override fun attachStorage(storage: Storage) {
        println("Attach $storage to Ec2Instance")
    }

    override fun start() {
        println("Ec2Instance started")
    }

    override fun stop() {
        println("Ec2Instance stopped")
    }
}