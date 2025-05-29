package org.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AppController {

    @GetMapping("/status-check")
    public String checkStatus(){
        return "working..";
    }
}
