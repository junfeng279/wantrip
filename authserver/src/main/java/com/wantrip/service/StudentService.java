package com.wantrip.service;

import com.wantrip.domain.Student;

import java.util.List;

/**
 * Created by junfeng on 17-8-12.
 */
public interface StudentService {
    public List<Student> getStudents();

    public void create(Student student) throws Exception;

}
