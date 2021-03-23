package com.sjl.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//标注这个类是一个springboot应用
@SpringBootApplication
@MapperScan("com.sjl.community.mapper")
@EnableScheduling
@EnableAsync
@MapperScan("com.sjl.community.mapper")
@SpringBootApplication
public class CommunityApplication {
//        启动springboot应用
    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
