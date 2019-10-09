package com.wp.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 *
 * @author 文攀 2019/10/09 13:43
 */
@Controller
public class DemoController {

    @GetMapping(value = "/hello")
    public String hello(){

        System.out.println("====================================>hello world!!!");

        return "hello";
    }

}
