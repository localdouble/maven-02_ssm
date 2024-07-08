package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 蒋诚
 * Wechat 15515867726
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
    }
    @PutMapping
    public Boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        bookService.delete(id);
        return true;
    }
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        System.out.println("getbyId...."+id);
        System.out.println("getbyId111111222...."+id);
        return bookService.getById(id);
    }
    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
