package com.techiesachin.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBook(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"core java",400));
        books.add(new Book(102,"Hibernate",500));
        books.add(new Book(103,"Spring",600));
        books.add(new Book(104,"Web Service",700));

        return books;
    }
}
