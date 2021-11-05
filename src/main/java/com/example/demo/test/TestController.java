package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/hello")
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping(value = "/git")
    public String gitHelloWorld(){
        return "git hello world";
    }
}
