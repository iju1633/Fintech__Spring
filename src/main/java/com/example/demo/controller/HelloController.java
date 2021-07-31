package com.example.demo.controller;

import com.example.demo.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
@Slf4j
public class HelloController {

//    MemberService memberService;
//    @Autowired
//    private void setMemberService(MemberService memberService){
//        this.memberService = memberService;
//    }

    @GetMapping("hello-mvc")
    public String helloTemplate(String name, Model model) {
        model.addAttribute("name", name);
        return "hello-templates";
    }

    @PostConstruct
    public void PostConstruct(){
        log.info("I am already CONSTRUCTED");
        }

    @PreDestroy
    public void PreDestory(){
        log.info("?");
        log.info("I will be destroyed.");
        }
}
