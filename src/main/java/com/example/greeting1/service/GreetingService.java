package com.example.greeting1.service;

import com.example.greeting1.model.Greeting;
import com.example.greeting1.repo.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    GreetingRepo greetingRepo;

    public String getmsg(Greeting greeting){
        greetingRepo.save(greeting);
        return greeting.getId()+greeting.getName()+greeting.getMessage();

    }


}
