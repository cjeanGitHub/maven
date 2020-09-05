package com.cjean.exercise.exercise01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class Exercise01Application extends SpringBootServletInitializer {

    /**
   boot项目打war包 需要在启动类中 extends SpringBootServletInitializer
     并且实现
     @Override
     protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
     return builder.sources(启动类名.class);
     }



     */

    public static void main(String[] args) {
        SpringApplication.run(Exercise01Application.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Exercise01Application.class);
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
