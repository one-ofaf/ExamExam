package com.cq;

import com.cq.mapper.BookMapper;
import com.cq.pojo.Book;
import com.cq.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryWebManagementApplicationTests {
@Autowired
 BookMapper bookMapper;

@Autowired
BookService bookService;
//新增
    @Test
public void addTest(){
    Book javaBook = new Book( 0,"Java编程思想", "Bruce Eckel", "978-0131872486", 2006, "可借");
    bookMapper.insert(javaBook);
}
//根据id删除
    @Test
   public  void deleteTest() {
        bookService.delete(29);
    }
//根据id修改
@Test
public void updateTest(){
        Book book1 = new Book();
        book1.setAuthor("lisi");
        book1.setBookId(23);
bookService.update(book1);

}


}
