package com.wangcan.mybatis.demo;

import com.wangcan.mybatis.demo.domain.User;
import com.wangcan.mybatis.demo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Application {


    public static void main(String[] args) {
        //xml 配置
        try {
            SqlSessionFactory SqlSessionFactory = null;
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"dev");
            SqlSession sqlSession = SqlSessionFactory.openSession();
            SqlSessionFactory.getConfiguration();
            //直接掉用
//            Integer id = sqlSession.selectOne("com.wangcan.mybatis.demo.mapper.UserMapper.select", 1);
//            System.out.println(id);
            //通过接口调用
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.select(1);
            //测试本地缓存
            User user1 = mapper.select(1);
            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
