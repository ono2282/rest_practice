package com.example.practice.app.controller;

import com.example.practice.app.mapper.BookMapper;
import com.example.practice.app.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/book")
public class BookController {
    //test

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookModel> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public BookModel getBookById(@PathVariable("bookId") int bookId) {
        return bookMapper.getBookById(bookId);
    }


}