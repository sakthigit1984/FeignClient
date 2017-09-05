package com.java.FeignClient;

public class TestFeign {



    public static void main(String[] args) throws Exception {
        UserRepoImpl bookRepository = new UserRepoImpl();
        String users = bookRepository.userList();
        System.out.println(users);
    }
}


