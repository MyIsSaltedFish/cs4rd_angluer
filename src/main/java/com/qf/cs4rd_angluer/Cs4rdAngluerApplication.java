package com.qf.cs4rd_angluer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.cs4rd_angluer.mapper")
public class Cs4rdAngluerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cs4rdAngluerApplication.class, args);
    }
}
