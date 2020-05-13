package com.cjean.exercise.exercise01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResControllerDemo {

    @RequestMapping("/recomplite")
    public String recomplite(){
//        return "recomplite";
        return "recomplite222";
    }
}
