package com.appsource.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskManagerController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Task Manager App";
    }
}



