package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Syen
 * @date 2019/7/28 0028-上午 11:33
 */
@Controller
@RequestMapping("/bad")
public class BadController {


    @RequestMapping("/badHello")
    public String greeted(){

        System.out.println("hello boy!");

        return "forward";

    }



}
