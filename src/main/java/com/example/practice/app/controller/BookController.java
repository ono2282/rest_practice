package com.example.practice.app.controller;

import com.example.practice.app.mapper.BookMapper;
import com.example.practice.app.mapper.TestMapper;
import com.example.practice.app.model.BookModel;
import com.example.practice.app.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

//@Path("api/book")
@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    //@GET
    @RequestMapping(method = RequestMethod.GET)
    public List<BookModel> getAllBooks() {
        return bookMapper.getAllBooks();
    }


    //@GET
    //@Path("/{bookId}")
    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public BookModel getBookById(@PathVariable("bookId") int bookId) {
        return bookMapper.getBookById(bookId);
    }


}