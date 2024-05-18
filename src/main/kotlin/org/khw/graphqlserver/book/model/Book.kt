package org.khw.graphqlserver.book.model

data class Book(
    val id: Long,
    val title: String,
    val author: String,
    val yearPublished: Int
)
