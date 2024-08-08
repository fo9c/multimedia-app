package cn.fo9c.multimedia_main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String user() {
        System.out.println("user");
        return "user";
    }

}