package com.cq.controller;

import com.cq.pojo.Book;
import com.cq.pojo.Result;
import com.cq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
     @Autowired
    BookService bookService;
    @GetMapping("/books")
    public Result select(){
        List<Book> bookList = bookService.select();
        return Result.success(bookList);
    }
    //添加书籍
    @PostMapping("/books")
    public Result addBook(@RequestBody Book book){
            bookService.addBook(book);
        return Result.success();
    }
    //删除书籍
    @DeleteMapping("/books/{id}")
    public  Result delete(@PathVariable Integer id){
        bookService.delete(id);
        return Result.success();
    }
    //修改书籍
    @PutMapping("/books")
    public  Result update(@RequestBody Book book){
    bookService.update(book);
    return Result.success();
}
}
