package com.xupq;

import com.xupq.entity.User;
import com.xupq.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan(value = "com.xupq.mapper")
@RestController
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Autowired private UserMapper userMapper;

    @RequestMapping("/")
    public void insert(){

        User user = new User();
        user.setUsername("jon.xu");
        user.setPassword("123456");
        user.setStatus(1);
        userMapper.addUser(user);
    }
}
