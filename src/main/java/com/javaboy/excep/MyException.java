package com.javaboy.excep;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyException {
//    拦截所有异常
    @ExceptionHandler(Exception.class)
    public ModelAndView fileuploadException(Exception e){
        ModelAndView error = new ModelAndView("error");
        error.addObject("error", e.getMessage());
        return error;
    }
}
