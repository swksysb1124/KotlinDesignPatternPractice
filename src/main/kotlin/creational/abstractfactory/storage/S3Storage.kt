package org.example.creational.abstractfactory.storage

class S3Storage(capacityInMib: Int): Storage {
    init {
        println("Allocated $capacityInMib on S3")
    }

    override fun getId(): String {
        return "S31"
    }
}