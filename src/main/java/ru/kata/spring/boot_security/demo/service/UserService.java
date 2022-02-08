package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();


    User getUserById(long id);

    void addUser(User user);


    void updateUser(User user);

    void deleteUserById(long id);


}
