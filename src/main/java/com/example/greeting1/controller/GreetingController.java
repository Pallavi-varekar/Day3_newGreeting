package com.example.greeting1.controller;

import com.example.greeting1.model.Greeting;
import com.example.greeting1.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {
@Autowired
GreetingService greetingService;
    @PostMapping("/post")
    public String sayhello(@RequestBody Greeting greeting){
        greetingService.getmsg(greeting);
        return "hello"+" "+greeting.getId()+" "+greeting.getName()+" "+greeting.getMessage();
    }
    @GetMapping("/get")
    public List<Greeting> getmsg(){
        List<Greeting> msg= greetingService.getmsgwithuser();
        return msg;
    }



    }

