package com.rt.redisapicachingdemo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {

    private String isbn;
    private String title;

    private String author;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        System.out.println("Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '}');
    }
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        System.out.println("Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + ", author='" + author + '\'' + '}');
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}
