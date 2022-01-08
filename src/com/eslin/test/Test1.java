package com.eslin.test;

import com.eslin.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Student s = session.selectOne("test1.getById","2");
        System.out.println(s);
        //session.close();

        Student s1 = new Student();
        s1.setId("4");
        s1.setName("mks");
        s1.setAge(21);
        session.insert("test1.save",s1);

        session.update("test1.update",s1);

        session.delete("test1.delete",1);

        session.commit();

        session.close();

    }
}
