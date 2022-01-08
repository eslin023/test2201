package com.eslin.test;

import com.eslin.dao.StudentDao;
import com.eslin.domain.Student;
import com.eslin.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;

public class test4 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSession();
        System.out.println(session);
        Connection connection = session.getConnection();
        System.out.println(connection);

    }
}
