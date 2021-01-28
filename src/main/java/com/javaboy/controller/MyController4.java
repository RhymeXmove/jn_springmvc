package com.javaboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/contr4")
public class MyController4 {
//    ModelAndView分为两部分，Model在参数中指定，返回值为逻辑视图名View
    @RequestMapping("/hello1")
    public String hello1(Model model) {
        model.addAttribute("username", "javaboy");
        return "hello3"; //表示去查找一个名为hello的视图
    }

//    服务端跳转
    @RequestMapping("/hello2")
    public String hello2() {
        return "forward:/jsp/hello5.jsp";
    }

    //客户端跳转
    @RequestMapping("hello3")
    public String hello3() {
        return "redirect:/user/hello3";
    }

    //返回字符串
    @RequestMapping(value = "/hello4", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String hello4() {
        return "SpringMVC--返回字符串";
    }
}
