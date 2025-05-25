package org.example.structural.composite.file

// Component
abstract class File(
    private var name: String
) {
    private var permissions: Array<String> = emptyArray()

    fun getPermissions(): Array<String> = permissions

    fun setPermissions(permissions: Array<String>) {
        this.permissions = permissions
    }

    fun getName(): String = name

    fun setName(name: String) {
        this.name = name
    }

    abstract fun isLeaf(): Boolean

    abstract fun ls()

    abstract fun addFile(file: File)

    abstract fun getFiles(): List<File>

    abstract fun removeFile(file: File)
}