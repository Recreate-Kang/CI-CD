package com.ttabong.devenv.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testcontroller {

    @GetMapping("")
    public String test() {
        System.out.println("it is workgin~~~~~~~~~~");
        return "test working~~~~~~~~~~~~";
    }
}
