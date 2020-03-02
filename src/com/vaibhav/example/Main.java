package com.vaibhav.example;

public class Main {

    public static void main(String[] args) {
	 User user1 = new User.UserBuilder("test1", "test1").address("home").age(20).phone("123").build();
        User user2 = new User.UserBuilder("test2", "test2").age(24).phone("456").build();
    }
}
