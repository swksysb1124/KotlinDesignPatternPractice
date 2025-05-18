package org.example.creational.abstractfactory

import org.example.creational.abstractfactory.instance.AwsResourceFactory
import org.example.creational.abstractfactory.instance.Instance
import org.example.creational.abstractfactory.resourcefactory.GoogleResourceFactory
import org.example.creational.abstractfactory.resourcefactory.ResourceFactory

class Client(
    private val resourceFactory: ResourceFactory
) {
    fun createService(capacity: Instance.Capacity, capacityInMib: Int): Instance {
        val instance = resourceFactory.createInstance(capacity)
        val storage = resourceFactory.createStorage(capacityInMib)
        instance.attachStorage(storage)
        return instance
    }
}

fun main() {
    val aws = Client(AwsResourceFactory())
    val i1 = aws.createService(Instance.Capacity.Micro, 20480)
    i1.start()
    i1.stop()
    println("-------------------------------")
    val google = Client(GoogleResourceFactory())
    val i2 = google.createService(Instance.Capacity.Micro, 20480)
    i2.start()
    i2.stop()
}