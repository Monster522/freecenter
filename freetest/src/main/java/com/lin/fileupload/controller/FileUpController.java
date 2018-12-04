package com.lin.fileupload.controller;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by baozang Cotter on 2018/11/29.
 */
@RestController
public class FileUpController {
    //文件目录
    private final static String filePath = "D://testImg/";

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception{
        // 声明一个json对象
        JSONObject result = new JSONObject();

        // 从请求中获取name参数
        String name = request.getParameter("name");

        // 从MultipartFile中获取 文件名（包括文件名） 参数
        String fileName = file.getOriginalFilename();

        // 从MultipartFile中获取 文件后缀 参数
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        // 重新生成唯一文件名，用于存储数据库
        String newFileName = UUID.randomUUID().toString()+suffixName;

        //创建文件对象
        File dest = new File(filePath + newFileName);

        // 记录文件信息返回json
        Map map = new HashMap();
        map.put("filePath", dest.getAbsolutePath());
        map.put("name", name);
        try {
            file.transferTo(dest);//将文件写入，转换成本地文件
            result.put("success", true);
            result.put("data", map);
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  result.put("success", false).toString();
    }

}
