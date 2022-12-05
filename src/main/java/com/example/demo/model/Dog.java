package com.example.demo.model;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    public Dog(){
        System.out.println("Dog object created ....");
    }
    public void info(){
        System.out.println("This is german Shepard Dog");
    }
    @PreDestroy
    public  void destroy(){
        System.out.println("Dog object destroyed");
    }
}
