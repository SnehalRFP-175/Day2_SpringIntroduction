package com.example.springintroduction.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    /*
    * UC1- Get Request Methode to show the Message
    */
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Bridgelabz";
    }

}