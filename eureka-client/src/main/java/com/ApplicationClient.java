package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mjp
 * @date 2020/4/22 - 3:23
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationClient {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationClient.class,args);


    }
}
