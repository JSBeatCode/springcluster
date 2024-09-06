package com.app.clusterapp.controller;

import java.time.LocalDateTime;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController // Uncomment this annotation if the controller is only for a backend service (e.g., returning JSON).
@Controller // Use this annotation if the controller is serving a Thymeleaf UI (for rendering HTML pages).
public class HelloController {

    @GetMapping("/")  // Map HTTP GET requests for the root URL ("/") to this method.
    public String hello(Model model) {
        // Get the current time
        LocalDateTime currentTime = LocalDateTime.now();
        
        // Print the current time in the default format to the console
        System.out.println("2.0 Current time: " + currentTime);

//      return "2.0 Hello, Kubernetes! " + currentTime;  // Uncomment this to return a plain text response with a message and the current time.
        return "index";  // Return the name of the Thymeleaf template (index.html) to be rendered.
    }
}
