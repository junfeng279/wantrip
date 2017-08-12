package com.wantrip.repository;

import com.wantrip.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by junfeng on 17-8-12.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
    public Student findByUsername(String username);
}
