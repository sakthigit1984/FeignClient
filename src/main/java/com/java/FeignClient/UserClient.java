package com.java.FeignClient;

import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



public interface  UserClient {



    @RequestLine("GET /users")
     String userList();
}
