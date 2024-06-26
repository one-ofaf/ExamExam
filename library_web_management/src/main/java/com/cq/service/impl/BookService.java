package com.cq.service.impl;


import com.cq.mapper.BookMapper;
import com.cq.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements com.cq.service.BookService {
    @Autowired
private BookMapper bookMapper;


    @Override
    public List<Book> select() {
        List<Book> bookList = bookMapper.select();
return  bookList;
    }

    @Override
    public void addBook(Book book) {
        bookMapper.insert(book);
    }

    @Override
    public void delete(Integer id) {
        bookMapper.delete(id);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }
}
