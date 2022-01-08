package com.eslin.test;

import com.eslin.dao.StudentDao;
import com.eslin.domain.Student;
import com.eslin.util.SqlSessionUtil;
import com.eslin.vo.StudentAndClassroomVo;

import java.util.List;

public class test3 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
        System.out.println(studentDao);
        Student s = studentDao.getById("2");
        System.out.println(s);

        List<StudentAndClassroomVo> voList = studentDao.select21();
        for(StudentAndClassroomVo vo:voList){
            System.out.println(vo);
        }



    }
}
