package com.mjp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjp
 * @date 2020/4/22 - 3:35
 */
@RestController
public class LoginController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(String name){
        return  "hi"+name+",i am"+port+"port";
    }

}
