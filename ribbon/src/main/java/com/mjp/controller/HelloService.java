package com.mjp.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author mjp
 * @date 2020/4/22 - 3:57
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "obtainfailure")
    public  String obtainOtherServieData(String name){
        return  restTemplate.getForObject("http://SERVICE-CLIENT/hi?name=" + name, String.class);
    }

    public String obtainfailure (String name){

        return  "sorry,"+ name +"出错了";
    }
}
