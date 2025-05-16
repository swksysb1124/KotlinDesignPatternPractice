package org.example.creational.prototype

fun main() {
    val s1 = Swordsman()
    s1.move(Position3D(-10f, 0f, 0f))
    s1.attack()
    println(s1)

    val s2 = s1.clone() as Swordsman
    println("Cloned swordsman $s2")
}