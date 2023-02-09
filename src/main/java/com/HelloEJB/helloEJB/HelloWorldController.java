package com.HelloEJB.helloEJB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // To let spring know what to do with it
public class HelloWorldController {

    @RequestMapping("/hello") //Default to the root directory because we are not providing any arguments
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
}
