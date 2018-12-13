package com.xupq.test.mapper;

import com.xupq.entity.User;
import com.xupq.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.xupq.mapper")
//@SpringBootTest
@SpringBootTest(classes={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})
public class UserMapperTest {

    @Autowired private UserMapper userMapper;

    @Test
    public void test1(){

        User user = new User();
        user.setUsername("tingting");
        user.setPassword("smart");
        user.setStatus(2);
        userMapper.addUser(user);
        Assert.assertNotNull(user.getId());
    }
}
