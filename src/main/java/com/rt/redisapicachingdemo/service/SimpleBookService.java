package com.rt.redisapicachingdemo.service;

import com.rt.redisapicachingdemo.domain.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SimpleBookService {

    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        return new Book(isbn, "Self-help");
    }

    @Cacheable("books")
    public Book getByIsbnAndAuthor(String isbn, String author) {
        return new Book(isbn, "Tech", "John");
    }
}
