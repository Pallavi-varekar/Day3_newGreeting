package com.example.greeting1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Greeting {
    @Id
    @GeneratedValue


    private int id;

    public Greeting(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Greeting() {

    }
    public Greeting(int incrementAndGet, String message){
        this.id = incrementAndGet;
        this.message = message;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}



