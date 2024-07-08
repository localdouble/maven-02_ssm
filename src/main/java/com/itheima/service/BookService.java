package com.itheima.service;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 蒋诚
 * Wechat 15515867726
 */
@Transactional//事务管理
public interface BookService {
    /*
    * 保存
    * */
    public Boolean save(Book book);
    /*
     * 修改
     * */
    public Boolean update(Book book);
    /*
     * 删除
     * */
    public Boolean delete(Integer id);
    /*
     * 按id查单个
     * */
    public Book getById(Integer id);
    /*
     * 全查
     * */
    public List<Book> getAll();
}
