package com.mjp.controller;

import org.springframework.stereotype.Component;

/**
 * @author mjp
 * @date 2020/4/27 - 1:17
 */
@Component
public class    ErrorHandle implements  HelloService {
    @Override
    public String obtainOtherServerJsonData(String name) {
        return "很抱歉,"+name+"这里出现错误";
    }
}
