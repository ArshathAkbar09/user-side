package com.project.user.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.user.management.dto.UserRequestDto;
import com.project.user.management.dto.UserResponseDto;
import com.project.user.management.entity.Users;
import com.project.user.management.repository.UsersRepository;

@Service
public class UserServiceImplementation implements UserService {

    private UsersRepository repo;

    public UserServiceImplementation(UsersRepository repo) {
        this.repo = repo;
    }

    @Override
    public String register(UserRequestDto userDto) {

        Users user = new Users();

        user.setName(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setMobile(userDto.getMobile());
        user.setDob(userDto.getDob());
        user.setGender(userDto.getGender());
        user.setAddress(userDto.getAddress());
        user.setUrl(userDto.getDpUrl());

        repo.save(user);

        return "User Registered Successfully";
    }

    @Override
    public UserResponseDto searchUser(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDto> viewAllUsers() {
        return null;
    }

    @Override
    public String updateUser(Users user) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}