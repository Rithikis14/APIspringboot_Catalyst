package com.deploy.SpringAPI.service;

import com.deploy.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Hareesh", 22, "hareesh@mail.com");
        User user2 = new User(2, "Rajendran", 57, "rajendran@mail.com");
        User user3 = new User(3, "Brinda", 23, "brinda@mail.com");
        User user4 = new User(4, "Vipin", 23, "vipin@mail.com");
        User user5 = new User(5, "Srini", 22, "srini@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}
