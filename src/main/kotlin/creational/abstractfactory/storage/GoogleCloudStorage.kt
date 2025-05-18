package org.example.creational.abstractfactory.storage

class GoogleCloudStorage(capacityInMib: Int): Storage {
    init {
        println("Allocated $capacityInMib on Google Cloud Storage")
    }

    override fun getId(): String {
        return "gcpcs1"
    }
}