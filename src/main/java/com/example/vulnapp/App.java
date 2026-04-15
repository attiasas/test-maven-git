package com.example.vulnapp;

/**
 * Minimal entry point for Xray binary/JAR scanning tests.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("VulnApp started");
        System.out.println(new GreetingService().greet("scanner"));
    }
}
