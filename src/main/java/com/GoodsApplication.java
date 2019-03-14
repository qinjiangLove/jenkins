package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@EnableEurekaClient
@MapperScan("com.**.dao")
@SpringBootApplication
public class GoodsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GoodsApplication.class);
    }

}

