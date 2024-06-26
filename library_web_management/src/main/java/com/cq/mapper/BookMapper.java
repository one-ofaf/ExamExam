package com.cq.mapper;

import com.cq.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
    @Mapper
    public interface BookMapper {
        @Insert("INSERT INTO books (title, author, isbn, published_year, status) VALUES (#{title},#{author},#{isbn},#{publishedYear},#{status})")
        void insert(Book book);
        @Delete("DELETE FROM books WHERE book_id = #{id}")
        void delete(Integer id);
        void update(Book book);
        @Select("select * from books")
        List<Book> select();
    }

