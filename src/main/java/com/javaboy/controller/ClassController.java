package com.javaboy.controller;

import com.javaboy.pojo.MyClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassController {
    @RequestMapping("/addclass")
    public String addBook() {
        return "addClass";
    }

    @RequestMapping("/doAddClass")
    @ResponseBody
    public String addClass(MyClass myClass) {
        System.out.println(myClass);
        return myClass.toString();
    }
}
