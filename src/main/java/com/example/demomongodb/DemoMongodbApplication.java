package com.example.demomongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DemoMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMongodbApplication.class, args);
    }

}
