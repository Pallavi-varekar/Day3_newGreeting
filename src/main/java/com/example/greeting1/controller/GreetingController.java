package com.example.greeting1.controller;

import com.example.greeting1.model.Greeting;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @PostMapping("/post")
    public String sayhello(@RequestBody Greeting greeting){

        return "Hello" +"  "+ greeting.getName() + " " + greeting.getMessage()+"!";
    }
}
