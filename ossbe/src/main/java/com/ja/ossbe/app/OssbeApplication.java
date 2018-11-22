package com.ja.ossbe.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OssbeApplication {

    public static void main(String[] args) {
            SpringApplication.run(OssbeApplication.class, args);
        }

}
