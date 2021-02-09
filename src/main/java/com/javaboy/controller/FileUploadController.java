package com.javaboy.controller;

import org.springframework.stereotype.Controller;
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
    public String upload(MultipartFile file, HttpServletRequest req){
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try{
            file.transferTo(new File(folder, newName));
            //上传到的路径为jn_springmvc\target\jn_springmvc\img\
            String url = req.getScheme() + "://" + req.getServerName()
                    + ":" + req.getServerPort() + "/img" +format + newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed";
    }
}
