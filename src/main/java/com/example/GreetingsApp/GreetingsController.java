package com.example.GreetingsApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class GreetingsController {

    @GetMapping("/hello/stranger")
    public String greetStranger(){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println("Stranger has been called:" +timeStamp);
        return "Greetings Stranger:" + timeStamp;
    }

    @GetMapping("/hello/friend")
    public String helloStranger(){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println("Friend  has been called:" +timeStamp);
        return "Greetings Friend:" + timeStamp;
    }


    @GetMapping("/bye/friend")
    public String byeFriend(){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println("Bye friend has been called:" +timeStamp);
        return "Bye Friend:" + timeStamp;
    }

}
