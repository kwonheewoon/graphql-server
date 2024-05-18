package org.khw.graphqlserver.book.controller

import lombok.RequiredArgsConstructor
import org.khw.graphqlserver.book.model.Book
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@RequiredArgsConstructor
@Controller
class BookController {

    @QueryMapping(name = "getBookById")
    fun getBookById(@Argument id: Int): Book {
        return Book(1L, "책 제목", "지은이", 2022)
    }
}