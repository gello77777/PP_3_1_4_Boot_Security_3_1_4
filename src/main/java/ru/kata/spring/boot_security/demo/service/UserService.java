package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;


public interface UserService {
    List<User> getAllUser();
    void addUser(User u);
    void deleteById(Long id);
    User getUserById(Long id);
    void updateUser(User u);
    User getByName(String name);
}
