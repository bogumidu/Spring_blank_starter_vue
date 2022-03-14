package com.bsd.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MainApplication {
    /**
     * Before start the application, add enviromenent variables in run configuration
     * PORT
     * DATASOURCE_URL
     * DATASOURCE_USERNAME
     * DATASOURCE_PASSWORD
     * BASE_URL
     */
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
