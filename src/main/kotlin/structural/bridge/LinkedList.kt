package org.example.structural.bridge

// Implementor
interface LinkedList<T> {
    fun addFirst(element: T)
    fun removeFirst(): T
    fun addLast(element: T)
    fun removeLast(): T
}

// Concrete Implementor
class SinglyLinkedList<T> : LinkedList<T> {
    override fun addFirst(element: T) {
        TODO("Not yet implemented")
    }

    override fun removeFirst(): T {
        TODO("Not yet implemented")
    }

    override fun addLast(element: T) {
        TODO("Not yet implemented")
    }

    override fun removeLast(): T {
        TODO("Not yet implemented")
    }
}

// Concrete Implementor
class ArrayLinkedList<T> : LinkedList<T> {
    override fun addFirst(element: T) {
        TODO("Not yet implemented")
    }

    override fun removeFirst(): T {
        TODO("Not yet implemented")
    }

    override fun addLast(element: T) {
        TODO("Not yet implemented")
    }

    override fun removeLast(): T {
        TODO("Not yet implemented")
    }
}