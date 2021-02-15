package com.javaboy.controller;

import com.alibaba.fastjson.JSON;
import com.javaboy.pojo.Book2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.event.ObjectChangeListener;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class Book2Controller {

    @RequestMapping(value = "/book2")
    @ResponseBody
    public List<Book2> getAllBook() {
        List<Book2> list = new ArrayList<Book2>();
        for (int i = 0; i < 10; i++) {
            Book2 book2 = new Book2();
            book2.setId(i);
            book2.setName("三体");
            book2.setAuthor("刘慈欣");
            book2.setPublish(new Date());
            list.add(book2);
        }
        return list;
    }

    @RequestMapping(value = "/addbook2")
    @ResponseBody
    public void addBook2(@RequestBody Book2 book2) {
        System.out.println(JSON.toJSONString(book2));
    }
}
