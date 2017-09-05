package com.java.FeignClient;


import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class UserRepoImpl {
    private static final String URI_BOOK = "http://localhost:8080";

    public String userList() throws Exception {
        UserClient bookResource = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(UserClient.class, URI_BOOK);
        return bookResource.userList();

    }
}
