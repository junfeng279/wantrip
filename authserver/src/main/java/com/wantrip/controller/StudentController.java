package com.wantrip.controller;

import com.wantrip.domain.Student;
import com.wantrip.repository.StudentRepository;
import com.wantrip.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by junfeng on 17-8-12.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public void createStudent() {
        Student stu = new Student();
        stu.setUsername("test");
        stu.setPassword("root");
        try {
            studentService.create(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/get")
    Object queryStudents() {

        return studentService.getStudents();
    }


    @RequestMapping("/students/{name}")
    Object queryStudentByName(@PathVariable String name) {

        return studentRepository.findByUsername(name);
    }
}
