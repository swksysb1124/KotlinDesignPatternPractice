package org.example.creational.simplefactory

import java.time.LocalDateTime

abstract class Post {
    var id: Long = 0L
    var title: String = ""
    var content: String = ""
    var createdOn: LocalDateTime = LocalDateTime.now()
    var publishedOn: LocalDateTime = LocalDateTime.now()
}

class NewPost: Post() {
    var headline: String = ""
    var newsTime: LocalDateTime = LocalDateTime.now()
}

class BlogPost: Post() {
    var author: String = ""
    var tags: List<String> = emptyList()
}