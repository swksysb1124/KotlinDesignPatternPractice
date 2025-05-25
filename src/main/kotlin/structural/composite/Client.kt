package org.example.structural.composite

fun main() {
    val rootDir = initializeFileHierarchy()
    rootDir.ls()
    println("----------------------------")
    printFileHierarchy("", rootDir)
}

fun printFileHierarchy(prefix: String, file: File) {
    println("$prefix$file")
    if (!file.isLeaf()) {
        file.getFiles().forEach { child ->
            printFileHierarchy("$prefix$file->", child)
        }
    }
}

fun initializeFileHierarchy(): Directory {
    val rootDir = Directory("root")
    rootDir.addFile(BinaryFile("rooFile1.bf", 40))
    rootDir.addFile(BinaryFile("rooFile2.bf", 30))
    val dir1 = Directory("dir1")
    dir1.addFile(BinaryFile("dir1File1.bf", 20))
    dir1.addFile(BinaryFile("dir1File2.bf", 20))
    rootDir.addFile(dir1)
    val dir2 = Directory("dir2")
    dir2.addFile(BinaryFile("dir2File1.bf", 20))
    rootDir.addFile(dir2)
    return rootDir
}