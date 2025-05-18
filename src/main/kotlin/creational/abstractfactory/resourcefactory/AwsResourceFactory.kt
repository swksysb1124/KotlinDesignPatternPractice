package org.example.creational.abstractfactory.resourcefactory

import org.example.creational.abstractfactory.instance.Ec2Instance
import org.example.creational.abstractfactory.instance.Instance
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