package org.example.structural.bridge

// Abstract
interface FifoCollection<T> {
    fun offer(element: T)
    fun poll(): T
}

// Refined Abstract
class Queue<T>(
    private val linkedList: LinkedList<T>
) : FifoCollection<T> {

    override fun offer(element: T) {
        linkedList.addLast(element)
    }

    override fun poll(): T {
        return linkedList.removeFirst()
    }
}