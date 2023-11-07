package com.traning.openshifthellow.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {
    @GetMapping("/hi")
    public String sayHi(){
        return "hi there from openshift  .";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye(){
        return "Goodbye dude :) .";
    }


    @GetMapping("/goodbye")
    public String tellYourName(){
        return "my name is ahmed  :) .";
    }

    @GetMapping("/ask")
    public String ask(){
        return "what is your name?";
    }
}
