package com.example.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("test@test.com");
        user.setName("testUser");

        System.out.println(">>> "+user.toString());
    }
}
