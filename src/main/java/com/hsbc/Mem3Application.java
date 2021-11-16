package com.hsbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@SpringBootConfiguration
@MapperScan("com.hsbc.mapper")
//@MapperScan("com.hsbc")
@EnableAspectJAutoProxy(exposeProxy =  true)
//@EnableAutoConfiguration
public class Mem3Application {

    public static void main(String[] args) {
        SpringApplication.run(Mem3Application.class, args);
    }

}
