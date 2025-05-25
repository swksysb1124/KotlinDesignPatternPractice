package org.example.structural.composite

class Directory(name: String) : File(name) {
    private val childFiles = mutableListOf<File>()

    override fun isLeaf() = false

    override fun ls() {
        childFiles.forEach { file ->
            println(file)
        }
    }

    override fun addFile(file: File) {
        childFiles.add(file)
    }

    override fun getFiles(): List<File> {
        return childFiles
    }

    override fun removeFile(file: File) {
        childFiles.remove(file)
    }

    override fun toString(): String {
        return getName()
    }
}