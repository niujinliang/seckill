package com.seckill.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("name","njl");
        return "hello";
    }
}
