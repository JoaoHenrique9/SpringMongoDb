package com.springbootexemple.services;

import java.util.List;

import com.springbootexemple.models.Book;

public interface BookService {
    Book create(Book book);

    Boolean delete(String id);

    List<Book> getAll();

    List<Book> getByCriteria(String criteria, String search);

    Book getById(String id);

    Boolean update(Book book);
}
