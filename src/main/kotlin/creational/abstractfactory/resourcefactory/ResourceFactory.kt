package org.example.creational.abstractfactory.resourcefactory

import org.example.creational.abstractfactory.instance.Instance
import org.example.creational.abstractfactory.storage.Storage

interface ResourceFactory {
    fun createInstance(capacity: Instance.Capacity): Instance
    fun createStorage(capacityInMib: Int): Storage
}

