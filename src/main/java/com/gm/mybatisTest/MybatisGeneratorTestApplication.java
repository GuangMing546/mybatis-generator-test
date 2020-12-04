package com.gm.mybatisTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gm.mybatisTest.mapper")
public class MybatisGeneratorTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorTestApplication.class, args);
    }

}
