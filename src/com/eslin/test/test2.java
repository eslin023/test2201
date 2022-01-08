package com.eslin.test;

import com.eslin.domain.Student;
import com.eslin.service.StudentService;
import com.eslin.service.impl.StudentServiceImpl;
import com.eslin.util.ServiceFactory;

import java.util.List;

public class test2 {
    public static void main(String[] args) {
        //StudentService ss = new StudentServiceImpl();
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

        /*Student s = new Student();
        s.setId("10");
        s.setName("jack");
        s.setAge(23);
        ss.save(s);*/

        List<Student> studentList = ss.getAll();
        for(Student s:studentList){
            System.out.println(s);
        }

    }
}
