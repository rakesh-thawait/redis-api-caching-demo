package com.rt.redisapicachingdemo.controller;

import com.rt.redisapicachingdemo.domain.Book;
import com.rt.redisapicachingdemo.service.SimpleBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookRestController {

    @Autowired
    SimpleBookService bookService;

    @GetMapping("/book/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        Book book = bookService.getByIsbn(isbn);
        return book;
    }

    @GetMapping("/book/{isbn}/{author}")
    public Book getBook(@PathVariable String isbn, @PathVariable String author) {
        Book book = bookService.getByIsbnAndAuthor(isbn, author);
        return book;
    }

}
