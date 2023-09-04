package com.rt.redisapicachingdemo.repo;

import com.rt.redisapicachingdemo.domain.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}