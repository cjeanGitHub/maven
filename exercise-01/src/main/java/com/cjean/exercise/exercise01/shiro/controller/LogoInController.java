package com.cjean.exercise.exercise01.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LogoInController {
/**
*登陆
*/
    @RequestMapping("/loginShiro")
    public String login(String name, String password){
        try {
            UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(name,password);
            Subject currentUser = SecurityUtils.getSubject();//获取当前用户信息
            currentUser.login(usernamePasswordToken);//登陆验证
            System.out.print(currentUser);
            System.out.print("Jinlai");
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "index";//静态页面
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        try {
            System.out.print("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        } catch (Exception e) {
            e.printStackTrace();
            return "test访问失败";
        }
        return "test访问成功";
    }
    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        try {
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.checkPermission("create");
            System.out.print("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        } catch (Exception e) {
            e.printStackTrace();
            return "test1访问失败";
        }
        return "test1访问成功";
    }
    @RequestMapping("test2")
    @RequiresPermissions("create")
    @ResponseBody
    public String test2(){
        try {
           // Subject currentUser = SecurityUtils.getSubject();
            //currentUser.checkPermission("create");//验证是否有该权限
            System.out.print("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        } catch (Exception e) {
            e.printStackTrace();
            return "test2访问失败";
        }
        return "test2访问成功";
    }


    @RequestMapping("logout")
    @ResponseBody
    public String logout(){
        try {
            Subject currentUser = SecurityUtils.getSubject();//获取当前用户信息
            currentUser.logout();
        } catch (Exception e) {
            e.printStackTrace();
            return "退出失败";
        }
        return "退出成功";
    }

    public static void main(String[] args) {
       try {

       }catch (Exception e){

       }
    }
}