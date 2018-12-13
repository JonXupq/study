package com.xupq.mapper;

import com.xupq.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface UserMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into users (username, password, status) values (#{username}, #{password}, #{status})")
    public void addUser(User user);
}
