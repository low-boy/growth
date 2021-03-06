package com.ljf.growth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ljf.openapi")
public class GrowthApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrowthApplication.class, args);
    }

}
