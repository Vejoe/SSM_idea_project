package com.demo.controller;

import com.demo.entity.Students;
import com.demo.service.SSMTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

@RequestMapping(value = "/con")
public class DemoController {
    private SSMTestService SSM;

    @RequestMapping(value = "/hello")
    public ModelAndView hello() throws Exception {
        System.out.println("SpringMVC:hello world!");
        ModelAndView mv= new ModelAndView("views/hello");
        mv.addObject("message","Hello SpringMVC!");
        return mv;
    }

    @RequestMapping("/mybatis")
    public String mybatis(){

        return "views/hello.jsp";
    }
}
