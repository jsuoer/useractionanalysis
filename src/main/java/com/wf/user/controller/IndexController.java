package com.wf.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    @ResponseBody
    @RequestMapping("/ss")
    public String index(){
        return "aa";
    }

    @RequestMapping("/")
    public String index2(){
        return "index";
    }
}
