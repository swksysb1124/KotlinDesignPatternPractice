package org.example.structural.composite.file

import java.lang.UnsupportedOperationException

// Leaf
class BinaryFile(
    name: String,
    val size: Long
) : File(name) {

    override fun isLeaf() = true

    override fun ls() {
        println(this)
    }

    override fun addFile(file: File) {
        throw UnsupportedOperationException("Can't support add operation")
    }

    override fun getFiles(): List<File> {
        throw UnsupportedOperationException("Can't support get operation")
    }

    override fun removeFile(file: File) {
        throw UnsupportedOperationException("Can't support remove operation")
    }

    override fun toString(): String {
        return "${getName()}\t$size MB"
    }
}