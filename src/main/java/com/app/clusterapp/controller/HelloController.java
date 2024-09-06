package com.app.clusterapp.controller;

import java.time.LocalDateTime;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController // if it is for only backend service
@Controller // if it is for showing thymleaf ui 
public class HelloController {
    @GetMapping("/")
    public String hello(Model model) {
        // 현재 시간 가져오기
        LocalDateTime currentTime = LocalDateTime.now();
        
        // 기본 형식으로 출력
        System.out.println("2.0 현재 시간: " + currentTime);

//        return "2.0 Hello, Kubernetes! " + currentTime;
        return "index";
    }
}