package com.example.vulnapp;

public class GreetingService {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, world!";
        }
        return "Hello, " + name + "!";
    }
}
