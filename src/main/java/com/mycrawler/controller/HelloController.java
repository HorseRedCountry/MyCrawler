package com.mycrawler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  测试控制器
 * </P>
 *
 * @author Major Tom
 * @since 2021/11/14 23:10
 */
@RequestMapping(value = "/myCrawler")
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello";
    }
}
