package com.example.greeting1.controller;

import com.example.greeting1.model.Greeting;
import com.example.greeting1.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.css.Counter;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
@Autowired
GreetingService greetingService;
    @PostMapping("/post")
    public String sayhello(@RequestBody Greeting greeting){
        greetingService.getmsg(greeting);
        return "hello"+" "+greeting.getId()+" "+greeting.getName()+" "+greeting.getMessage();
    }
}
