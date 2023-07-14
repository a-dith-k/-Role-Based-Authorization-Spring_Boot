package com.example.securitytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {


    @GetMapping()
    public String getHome(){
        return "this is home for all";
    }

    @GetMapping("users")
    public String getUser(){
        return "this is for users only";
    }

    @GetMapping("admin")
    public String getAdmin(){

        return "this is for admins only";
    }


}
