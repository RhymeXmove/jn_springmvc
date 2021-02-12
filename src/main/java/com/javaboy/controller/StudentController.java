package com.javaboy.controller;

import com.javaboy.pojo.Student2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class StudentController {
    @RequestMapping("/addstudent")
    @ResponseBody
    public void addStudent(@Validated(ValidationGroup2.class) Student2 student2, BindingResult
                            result) {
        if (result != null) {
            //校验未通过，获取所哟异常信息并展示出来
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName()
                        + ":" + allError.getDefaultMessage());
            }
        }
    }
}
