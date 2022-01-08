package com.eslin.service.impl;

import com.eslin.dao.StudentDao;
import com.eslin.domain.Student;
import com.eslin.service.StudentService;
import com.eslin.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {

        Student s = studentDao.getById(id);
        return null;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> studentList = studentDao.getAll();
        return studentList;
    }
}
