package com.example.practice.app.mapper;

import com.example.practice.app.model.BookModel;
import org.apache.ibatis.annotations.*;

import javax.annotation.Generated;
import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM book")
    List<BookModel> getAllBooks();

    @Select("SELECT * " +
            "FROM book " +
            "WHERE book_id = #{bookId} ")
    BookModel getBookById(@Param("bookId") int bookId);


    @Insert("INSERT INTO book(title, price) " +
            "VALUES(#{book.title}, #{book.price})")
    @Options(useGeneratedKeys=true, keyColumn = "book_id", keyProperty = "book.bookId")
    int createBook( @Param("book") BookModel book);
}
