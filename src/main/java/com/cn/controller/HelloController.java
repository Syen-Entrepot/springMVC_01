package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Syen
 * @date 2019/7/28 0028-上午 11:04
 */
@Controller
@RequestMapping("/hello")
public class HelloController {


    //请求转发
    @RequestMapping("/forward")
    public String forward(Model model){
       //springmvc model默认在请求域上当中存储值
        System.out.println("请求转发.....");
        model.addAttribute("skill","飞翔");
        return "forward";
    }
    //重定向
    @RequestMapping("/redirect")
public String redirect(Model model){

        System.out.println("重定向....");
        model.addAttribute("db","是不是重定向......");
        /*不带斜杠的写法是一个相对路径，根据当前上下文决定。而上下文在hello
        * 如果是重定向，就跟视图解析的规则无关,与前后缀无半毛钱关系
        * */
        return "redirect:/jsp/redirect_01.jsp";
}
@RequestMapping("/forward1")
public String forwardAnotherController(){
        return "forward:/bad/badHello";
}

}
