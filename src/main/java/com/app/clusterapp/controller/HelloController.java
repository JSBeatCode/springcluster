package com.app.clusterapp.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        // 현재 시간 가져오기
        LocalDateTime currentTime = LocalDateTime.now();
        
        // 기본 형식으로 출력
        System.out.println("현재 시간: " + currentTime);

        return "Hello, Kubernetes! " + currentTime;
    }
}