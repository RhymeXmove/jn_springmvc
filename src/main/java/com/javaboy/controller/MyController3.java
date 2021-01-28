package com.javaboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
//请求窄化
public class MyController3 {
    @RequestMapping(value = {"/hello3","hello3-2"})
    //多个地址映射到同一个方法
/*    @RequestMapping(value = "/hello", mehtod = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
      指定多个访问方法
     */
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello3");
        mv.addObject("username", "Spring");
        return mv;
    }
}
