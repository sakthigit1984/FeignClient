package com.java.FeignClient;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("/users")
    public String userList()
    {


        return "user";
    }
}
