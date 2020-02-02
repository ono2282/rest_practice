package com.example.practice.app.controller;

import com.example.practice.app.mapper.BookMapper;
import com.example.practice.app.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookModel> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public BookModel createBook(@RequestBody BookModel book) {
        bookMapper.createBook(book);
        return book;
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public BookModel getBookById(@PathVariable("bookId") int bookId) {
        return bookMapper.getBookById(bookId);
    }


}