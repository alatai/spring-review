package com.saihou.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 14:26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 文件上传（传统方式）
     */
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) {
        try {
            // 使用file upload组件完成上传
            // 上传位置
            String path = request.getSession().getServletContext().getRealPath("/upload");
            // 判断该路径是否存在
            File file = new File(path);

            if (!file.exists()) {
                // 创建文件夹
                file.mkdirs();
            }

            // 解析request对象，获取上传文件项
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            // 解析request
            List<FileItem> items = upload.parseRequest(request);
            // 遍历文件项
            for (FileItem item : items) {
                // 判断当前item对象是否是上传文件项
                if (item.isFormField()) { // 普通表单

                } else { // 上传文件项
                    // 获取上传文件的名称
                    String filename = item.getName();
                    // 把文件名称设置为唯一值
                    String uuid = UUID.randomUUID().toString().replace("-", "");
                    filename = uuid + filename;
                    item.write(new File(path, filename));
                    // 删除临时文件
                    item.delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }

    /**
     * 文件上传（spring-mvc方式）
     */
    @RequestMapping(value = "/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) {
        // 上传位置
        String path = request.getSession().getServletContext().getRealPath("/upload");
        // 判断该路径是否存在
        File file = new File(path);

        if (!file.exists()) {
            // 创建文件夹
            file.mkdirs();
        }

        // 获取上传文件名称
        String filename = upload.getOriginalFilename();
        // 把文件名称设置为唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;

        try {
            // 完成上传
            upload.transferTo(new File(path, filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }

    /**
     * 文件上传（跨服务器方式）
     */
    @RequestMapping(value = "/fileUpload3")
    public String fileUpload3(MultipartFile upload) {
        // 定义上传文件服务器路径
        String path = "http://localhost:8088/upload/";

        // 获取上传文件名称
        String filename = upload.getOriginalFilename();
        // 把文件名称设置为唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        // 完成跨服器上传
        // 创建客户端对象
        Client client = Client.create();
        // 和上传服务器进行连接
        WebResource resource = client.resource(path + filename);
        try {
            // 上传文件
            resource.put(upload.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }

    /**
     * 其他方法前执行
     */
    @ModelAttribute
    public void before(HttpServletRequest request) {
        System.out.println(request.getServletPath());
    }
}
