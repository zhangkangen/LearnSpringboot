package com.zh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BootApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootApplication.class, args);
    }
}
