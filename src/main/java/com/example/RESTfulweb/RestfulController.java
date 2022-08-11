package com.example.RESTfulweb;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {
    private static final String messageTemplate = "Good to see you, %s!";
    private final AtomicLong userCounter = new AtomicLong();

    @GetMapping("/")
    public RestfulRepository newUser(){
        return new RestfulRepository("Welcome to the world of adventure.");
    }

    @GetMapping("/user")
    public RestfulRepository user(@RequestParam(value = "name", defaultValue = "friend") String name){
        // @RequestParam binds the value of the query string parameter [name] into the [name] parameter.
        return new RestfulRepository(userCounter.incrementAndGet(), String.format(messageTemplate, name));
    }
}
