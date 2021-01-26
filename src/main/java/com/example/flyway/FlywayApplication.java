package com.example.flyway;

import com.example.flyway.config.AppConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.flyway.mapper")
public class FlywayApplication implements ApplicationRunner {
    @Autowired
    private AppConfig appConfig;

    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(appConfig);
    }
}
