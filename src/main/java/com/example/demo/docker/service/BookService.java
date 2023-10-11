package com.example.demo.docker.service;

import com.example.demo.docker.pojo.Book;

import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();
}
