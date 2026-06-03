package com.project.user.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.management.dto.UserRequestDto;
import com.project.user.management.dto.UserResponseDto;
import com.project.user.management.entity.Users;
import com.project.user.management.service.UserService;

@RestController
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRequestDto user) {
        return service.register(user);
    }

    @GetMapping("/searchUser/{id}")
    public UserResponseDto searchUser(@PathVariable Long id) {
        return service.searchUser(id);
    }

    @GetMapping("/viewAllUsers")
    public List<UserResponseDto> viewAllUsers() {
        return service.viewAllUsers();
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody Users user) {
        return service.updateUser(user);
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        return service.deleteUser(id);
    }
}
