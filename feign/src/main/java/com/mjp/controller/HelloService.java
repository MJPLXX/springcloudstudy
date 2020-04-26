package com.mjp.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mjp
 * @date 2020/4/22 - 4:15
 */
@FeignClient(value = "SERVICE-CLIENT" ,fallback = ErrorHandle.class)
@Service
public interface HelloService {
    /**
     * 从service-client 服务器的hi接口获取json数据
     *
     *
     * */
    @RequestMapping("/hi")
    String obtainOtherServerJsonData(@RequestParam(value = "name") String name);
//    String obtainOtherServerJsonData( String name);

}
