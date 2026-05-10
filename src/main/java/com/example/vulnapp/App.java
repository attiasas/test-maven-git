package com.example.vulnapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Minimal entry point for Xray binary/JAR scanning tests.
 */
public class App {

    private static final Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        log.info("VulnApp started");
        System.out.println(new GreetingService().greet("scanner"));
    }
}
