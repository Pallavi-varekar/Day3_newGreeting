package com.example.greeting1.repo;

import com.example.greeting1.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends JpaRepository<Greeting,Integer> {
}
