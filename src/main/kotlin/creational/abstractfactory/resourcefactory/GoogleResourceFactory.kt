package org.example.creational.abstractfactory.resourcefactory

import org.example.creational.abstractfactory.instance.GoogleComputeEngineInstance
import org.example.creational.abstractfactory.instance.Instance
import org.example.creational.abstractfactory.storage.GoogleCloudStorage
import org.example.creational.abstractfactory.storage.Storage

class GoogleResourceFactory: ResourceFactory {
    override fun createInstance(capacity: Instance.Capacity): Instance {
        return GoogleComputeEngineInstance(capacity)
    }

    override fun createStorage(capacityInMib: Int): Storage {
        return GoogleCloudStorage(capacityInMib)
    }
}