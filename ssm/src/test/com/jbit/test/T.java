package com.jbit.test;

import com.jbit.dao.UsersMapper;
import com.jbit.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Scanner;

public class T {

    SqlSession session;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
        session=sqlSessionFactory.openSession();
    }


    @Test
    public void test1() throws Exception {
        System.out.println("Hello");
    }

    @Test
    public void testMyBaits() throws Exception {
        Scanner input  = new Scanner(System.in);
        UsersMapper usersMapper= session.getMapper(UsersMapper.class);
        int res= usersMapper.insert(new Users("admin","123456"));
        System.out.println("--->"+res);
    }

    @Test
    public void testMyBaitsLogin() throws Exception {
        Scanner input  = new Scanner(System.in);
        UsersMapper usersMapper= session.getMapper(UsersMapper.class);
        Users users= usersMapper.getLogin("admin","2321321");
        System.out.println("--->"+users);
    }



    @After
    public void tearDown() throws Exception {
        session.commit();
        session.close();
    }
}
