package com.wangcan.mybatis.demo.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: wangcan
 * @date: 2021/9/12 11:11
 */
@SpringBootApplication
@ComponentScan("com.wangcan.mybatis.demo")
@MapperScan("com.wangcan.mybatis.demo.mapper")
public class BootApplication {

    public static void main(String[] args) {
        new SpringApplication(BootApplication.class).run(args);
    }

}
