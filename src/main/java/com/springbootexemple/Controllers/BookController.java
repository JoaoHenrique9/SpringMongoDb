package com.springbootexemple.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootexemple.models.Book;
import com.springbootexemple.services.BookServiceImpl;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.ok().body(bookService.getAll());
    }

    @RequestMapping(path = "/books/{criteria}/{search}", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getByCriteria(@PathVariable String criteria, @PathVariable String search) {
        return ResponseEntity.ok().body(bookService.getByCriteria(criteria, search));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getById(@PathVariable @NotEmpty @Size(max = 24) String id) {
        return ResponseEntity.ok().body(bookService.getById(id));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookService.create(book));
    }

    @PutMapping("/books")
    public ResponseEntity<Boolean> update(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookService.update(book));
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable @NotEmpty @Size(max = 24) String id) {
        return ResponseEntity.ok().body(bookService.delete(id));
    }
}