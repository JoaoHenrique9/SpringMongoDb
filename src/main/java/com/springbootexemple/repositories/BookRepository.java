package com.springbootexemple.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootexemple.models.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
