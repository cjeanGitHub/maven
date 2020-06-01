package com.cjean.exercise.exercise01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class Exercise01Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise01Application.class, args);
    }


    /**
     * 小程序生成订单
     */
    @ResponseBody
    @RequestMapping("/netapp")
    public String generateOrder() {
        return "hello net app....";

    }

}
