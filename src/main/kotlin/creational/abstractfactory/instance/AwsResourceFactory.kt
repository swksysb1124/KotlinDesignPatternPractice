package org.example.creational.abstractfactory.instance

import org.example.creational.abstractfactory.resourcefactory.ResourceFactory
import org.example.creational.abstractfactory.storage.GoogleCloudStorage
import org.example.creational.abstractfactory.storage.S3Storage
import org.example.creational.abstractfactory.storage.Storage

class AwsResourceFactory: ResourceFactory {
    override fun createInstance(capacity: Instance.Capacity): Instance {
        return Ec2Instance(capacity)
    }

    override fun createStorage(capacityInMib: Int): Storage {
        return S3Storage(capacityInMib)
    }
}