package com.example.usexml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.usexml.mapper")
public class UsexmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsexmlApplication.class, args);
    }

}
