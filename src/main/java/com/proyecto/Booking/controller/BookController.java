package com.proyecto.Booking.controller;

import com.proyecto.Booking.entities.Book;
import com.proyecto.Booking.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public void create(@RequestBody Book book){

        bookService.save(book);
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){

        return ResponseEntity.ok(bookService.findAll());
    }
}
