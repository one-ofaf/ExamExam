package com.cq.service;

import com.cq.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> select();

    void addBook(Book book);

    void delete(Integer id);

    void update(Book book);
}
