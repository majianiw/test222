package com.nowcoder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages="com.nowcoder.community.dao")
@SpringBootApplication
public class ThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreeApplication.class, args);
    }

}
