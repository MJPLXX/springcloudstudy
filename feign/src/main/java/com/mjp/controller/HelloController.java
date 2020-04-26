package com.mjp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjp
 * @date 2020/4/22 - 4:21
 */
@RestController
public class HelloController {
    @Autowired
    private  HelloService helloService;


@RequestMapping(value = "/sayHello")
    public  String sayHello(String name){
    return  helloService.obtainOtherServerJsonData(name);

}
}
