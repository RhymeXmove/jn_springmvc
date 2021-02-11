package com.javaboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");

    @RequestMapping("/uploadpage")
    public String addBook() {
        return "MultipartResolver-test";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest req) {
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder, newName));
            //上传到的路径为jn_springmvc\target\jn_springmvc\img\
            String url = req.getScheme() + "://" + req.getServerName()
                    + ":" + req.getServerPort() + "/img" + format + newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed";
    }

    @RequestMapping("/uploadpage2")
    public String addBook2() {
        return "upload2";
    }

    @RequestMapping("/upload2")
    @ResponseBody
    public String upload2(MultipartFile[] files, HttpServletRequest req) {
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        try {
            for (MultipartFile file : files) {
                String oldName = file.getOriginalFilename();
                String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
                file.transferTo(new File(folder, newName));
                //上传到的路径为jn_springmvc\target\jn_springmvc\img\
                String url = req.getScheme() + "://" + req.getServerName()
                        + ":" + req.getServerPort() + "/img" + format + newName;
                System.out.println(url);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "upload2 complete!!!";
    }

    @RequestMapping("/uploadpage3")
    public String addBook3() {
        return "upload3";
    }

    @RequestMapping("/upload3")
    @ResponseBody
    public String upload3(MultipartFile file1, MultipartFile file2, HttpServletRequest req) {
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        try {
            String oldName1 = file1.getOriginalFilename();
            String newName1 = UUID.randomUUID().toString() + oldName1.substring(oldName1.lastIndexOf("."));
            file1.transferTo(new File(folder, newName1));
            //上传到的路径为jn_springmvc\target\jn_springmvc\img\
            String url1 = req.getScheme() + "://" + req.getServerName()
                    + ":" + req.getServerPort() + "/img" + format + newName1;
            System.out.println(url1);

            String oldName2 = file2.getOriginalFilename();
            String newName2 = UUID.randomUUID().toString() + oldName2.substring(oldName2.lastIndexOf("."));
            file2.transferTo(new File(folder, newName2));
            //上传到的路径为jn_springmvc\target\jn_springmvc\img\
            String url2 = req.getScheme() + "://" + req.getServerName()
                    + ":" + req.getServerPort() + "/img" + format + newName2;
            System.out.println(url2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "upload3 complete!!!";
    }
}
