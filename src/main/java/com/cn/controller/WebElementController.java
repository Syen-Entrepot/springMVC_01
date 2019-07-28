package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;

/**
 * @author Syen
 * @date 2019/7/28 0028-上午 11:51
 */
@Controller
@RequestMapping("/web")
public class WebElementController {

    @RequestMapping("/request")
    public String request(WebRequest webRequest){
        System.out.println(webRequest.getParameter("girl"));


        return "forward";
    }

@RequestMapping("/session1")
    public String session1(HttpSession httpSession){

    httpSession.setAttribute("g","一休");

    httpSession.getServletContext().setAttribute("t","和尚");

    return "redirect:/jsp/redirect_01.jsp";
    }

   /* @RequestMapping(value = {"/m1","/m2"})*/
   /* @RequestMapping(path = {"/m1","/m2"})*/
    /*如果没有限定，啥请求都可以，*/
   @RequestMapping(path = {"/m1","/m2"},method = RequestMethod.POST)

    public String m1(){
        System.out.println("m1 .....");
        return "forward";
    }

    /*params描述了，我需要两个参数，一个是girl,一个是boy*/

    @RequestMapping(path = {"/m2"},params = {"girl=t","boy!=f"})

    public String m2(){
        System.out.println(" m2.....");
        return "forward";
    }

    /*@RequestMapping(path = {"/m3?"})*/
    /*@RequestMapping(path = {"/m3*"})*/
    @RequestMapping(path = {"/m3/**"})

    public String m3(){
        System.out.println("(ant**) m3.....");
        return "forward";
    }

   @GetMapping(path = {"/m4/**"})

    public String m4(){
        System.out.println("(ant**) m4.....");
        return "forward";
    }


    @DeleteMapping(path = {"/m5/**"})

    public String m5(){
        System.out.println("(ant**) m5.....");
        return "forward";
    }
}
