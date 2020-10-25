package com.example.usexml.mapper;

import com.example.usexml.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findById(Long id);

    void deleteById(Long id);

    int insertUser(User user);

    int updateById(User user);
}
