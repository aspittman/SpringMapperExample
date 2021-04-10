package com.example.MapperDummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapperDummyController {

    @GetMapping("/")
    public String sayHello() {
        return "home";
    }

}
