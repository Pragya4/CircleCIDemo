package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
    @RequestMapping("/hello")
    public String helloWorld(){
        return printHelloWorld();
    }

    @RequestMapping("/FMTSpring")
    public int demoFunction(){
        return 123;
    }

    public String printHelloWorld(){
        return "Hello world!!";
    }
}
