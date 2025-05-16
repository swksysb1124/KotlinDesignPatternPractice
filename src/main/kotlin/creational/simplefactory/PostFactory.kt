package org.example.creational.simplefactory

class PostFactory {
    companion object {
        fun createPost(type: String): Post {
            return when (type) {
                "news" -> NewPost()
                "blog" -> BlogPost()
                else -> throw IllegalArgumentException("Post type is unknown")
            }
        }
    }
}