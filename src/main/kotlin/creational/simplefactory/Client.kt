package org.example.creational.simplefactory

fun main() {
    val post = PostFactory.createPost("blog")
    println(post)
}
