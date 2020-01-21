package com.example.practice.app.mapper;

import com.example.practice.app.model.BookModel;
import com.example.practice.app.model.City;
import com.example.practice.app.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM book")
    List<BookModel> getAllBooks();

    @Select("SELECT * " +
            "FROM book " +
            "WHERE book_id = #{bookId} ")
    BookModel getBookById(@Param("bookId") int bookId);

}
