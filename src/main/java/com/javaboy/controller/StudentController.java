package com.javaboy.controller;

import com.javaboy.pojo.Book;
import com.javaboy.pojo.Student2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class StudentController {
    @RequestMapping("/addstudent")
    @ResponseBody
    // 实体类中groups包含指定的校验规则的会被校验并输出校验结果
    // @ModelAttribute("s")注解，给变量定义别名，student用s替代
    public String addStudent(@ModelAttribute("s") @Validated(ValidationGroup2.class) Student2 student2, BindingResult
                            result) {
        if (result != null) {
            //校验未通过，获取所哟异常信息并展示出来
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName()
                        + ":" + allError.getDefaultMessage());
            }
            return "student";
        }
        return "hello";
    }

    //定义全局数据公共部分
    @ModelAttribute("info")
    public Map<String, Object> info() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "javaboy");
        map.put("address", "www.javaboy.org");
        return map;
    }
}
