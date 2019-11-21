package com.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author lijian
 * @Date 2019/11/21 21:15
 */
//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
//@ResponseBody
//@Controller
//  上面两行一般多用在 Spring 项目中
@RestController // 在 Spring Boot 和 Spring4.2.x 之后使用这个来简化开发，返回 RESTAPI 规范的接口
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }

}
