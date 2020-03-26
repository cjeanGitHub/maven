package com.cjean.exercise.exercise01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kemp on 2018/8/15.
 */
@Controller
public class MyController {
 
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/login2")
    public String login2(){
        return "login2";
    }
}