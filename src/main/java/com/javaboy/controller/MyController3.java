package com.javaboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


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

    @RequestMapping("/hello4")
    public void hello4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/hello4.jsp").forward(request, response);
    }

    //        通过 HttpServletResponse 做重定向
    @RequestMapping("hello5")
    public void hello5(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("/jsp/hello4.jsp");

    }

//    手动指定响应头实现重定向
    @RequestMapping("hello6")
    public void hello6(HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(302);
        response.addHeader("Location", "/jsp/hello4.jsp");
    }

//    通过 HttpServletResponse 给出响应
    @RequestMapping("/hello7")
    public void hello7(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charser=utf-8");
        PrintWriter out = response.getWriter();
        out.write("<h1>hello7 javaboy!<h1>");
        out.flush();
        out.close();
    }
}
