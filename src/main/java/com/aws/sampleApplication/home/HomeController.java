package com.aws.sampleApplication.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to AWS demo";
    }
}
