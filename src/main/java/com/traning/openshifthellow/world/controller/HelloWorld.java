package com.traning.openshifthellow.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {
    @GetMapping("/hi")
    public String sayHi(){
        return "hi there from openshift .";
    }
}
