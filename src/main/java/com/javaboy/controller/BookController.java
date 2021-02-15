package com.javaboy.controller;

import com.javaboy.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @RequestMapping("/book")
    public String addBook() {
        return "addbook";
    }

    @RequestMapping(value = "/doAdd", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
    @ResponseBody
    public String doAdd(Book book) {

        return ("<h1>书名:"+book.getName()
                + "<br>作者姓名:"+book.getAuthor().getName()
                + "<br>作者年龄："+book.getAuthor().getAge()
                + "<br>兴趣爱好："+book.getAuthor().getFavorite()
                + "<br>价格:"+book.getPrice()
                + "<br>是否上架:"+book.getIspublic()
                + "<br>上架时间:"+book.getBookdate()
                + "<h1>");
    }

}
