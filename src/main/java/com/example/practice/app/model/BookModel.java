package com.example.practice.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookModel {

    private int bookId;

    private String title;

    private int price;
}
