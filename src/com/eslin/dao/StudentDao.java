package com.eslin.dao;

import com.eslin.domain.Student;
import com.eslin.vo.StudentAndClassroomVo;

import java.util.List;

public interface StudentDao {
    public Student getById(String id);
    public void save(Student s);

    List<Student> getAll();

    List<StudentAndClassroomVo> select21();
}
