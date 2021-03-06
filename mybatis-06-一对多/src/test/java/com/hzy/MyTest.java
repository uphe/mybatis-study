package com.hzy;

import com.hzy.mapper.StudentMapper;
import com.hzy.mapper.TeacherMapper;
import com.hzy.pojo.Student;
import com.hzy.pojo.Teacher;
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
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> allTeacher = mapper.findAllTeacher();
            System.out.println(allTeacher);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
