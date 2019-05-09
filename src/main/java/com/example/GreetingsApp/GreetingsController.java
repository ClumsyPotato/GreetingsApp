package com.example.GreetingsApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello/stranger")
    public String greetStranger(){
        return "Greetings Stranger";
    }

    @GetMapping("/hello/friend")
    public String helloStranger(){
        return "Greetings Friend";
    }

}
