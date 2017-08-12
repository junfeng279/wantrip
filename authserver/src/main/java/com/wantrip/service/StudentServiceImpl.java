package com.wantrip.service;

import com.wantrip.domain.Student;
import com.wantrip.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by junfeng on 17-8-12.
 */
@Service
public class StudentServiceImpl implements StudentService{
    private final Logger log = LoggerFactory.getLogger(getClass());
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void create(Student stu) throws Exception {

        Student existing = studentRepository.findOne(stu.getUsername());
        if(existing!=null){
            throw new Exception("user already exists: " + stu.getUsername());
        }

        String hash = encoder.encode(stu.getPassword());
        stu.setPassword(hash);
        studentRepository.save(stu);
    }

    @Override
    public List<Student> getStudents() {

        return (List<Student>) studentRepository.findAll();
    }
}
