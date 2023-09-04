package com.rt.redisapicachingdemo.controller;

import com.rt.redisapicachingdemo.domain.Book;
import com.rt.redisapicachingdemo.repo.SimpleBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @Autowired
    SimpleBookRepository bookRepo;

    @GetMapping("/book/{isbn}")
    public Book getBook(@PathVariable String isbn) {
        Book book = bookRepo.getByIsbn("test");
        return book;
    }
}
