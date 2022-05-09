package com.alatai.controller;

import com.alatai.entity.Student;
import com.alatai.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/12 15:08
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("index")
    public String index(Model model) {
        List<Student> students = studentService.selectAll();
        model.addAttribute("listData", students);
        return "index";
    }
}
