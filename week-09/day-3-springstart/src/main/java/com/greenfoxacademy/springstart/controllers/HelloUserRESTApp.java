package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloUserRESTApp {

    @RequestMapping(value = "/greetings")
    public Greetings greetingUser(@RequestParam("name") String name) {
        return new Greetings("Szia " + name);

    }
}
