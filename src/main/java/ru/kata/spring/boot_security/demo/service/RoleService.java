package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> getAllRoles();

    void updateRole(Role role);

    void removeRoleById(long id);

    void addRole(Role role);

    Role getRoleByName(String name);
}

