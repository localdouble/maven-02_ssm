package com.ithei.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 蒋诚
 * Wechat 15515867726
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }
    @Test
    public void testgetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
