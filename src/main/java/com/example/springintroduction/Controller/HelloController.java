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

    /*
    * UC2- Get request methode and passing the name as query parameter
    */
    @GetMapping("/helloParam")
    public String hello(@RequestParam String name){
        return "Hello "+ name +" from Bridgelabz";
    }
    /*
    * UC3-Get request methode and passing the Name as path variable get request mapping with path variable
    */
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+ name +" from Bridgelabz";
    }




}