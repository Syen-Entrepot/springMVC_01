package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 14:57
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/add/{id}/{name}/{price}")
    public String addProduct(@PathVariable("id")Integer id,@PathVariable("name") String name,@PathVariable("price") Double price){

        System.out.println(id+name+price);
        return "forward";
    }
}
