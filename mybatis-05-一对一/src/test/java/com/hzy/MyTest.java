package com.hzy;

import com.hzy.mapper.StudentMapper;
import com.hzy.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;

        try {
            //获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> allStudent = studentMapper.findAllStudent();
            System.out.println(allStudent);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
