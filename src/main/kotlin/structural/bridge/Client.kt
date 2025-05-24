package org.example.structural.bridge

fun main() {
    val fifoCollection1 = Queue(SinglyLinkedList<Int>())
    fifoCollection1.offer(1)
    fifoCollection1.poll()
    val fifoCollection2 = Queue(ArrayLinkedList<Int>())
    fifoCollection2.offer(2)
    fifoCollection2.poll()
}