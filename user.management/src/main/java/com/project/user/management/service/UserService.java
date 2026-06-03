package com.project.user.management.service;

import java.util.List;

import com.project.user.management.dto.UserRequestDto;
import com.project.user.management.dto.UserResponseDto;
import com.project.user.management.entity.Users;

public interface UserService {

    String register(UserRequestDto user);

    UserResponseDto searchUser(Long id);

    List<UserResponseDto> viewAllUsers();

    String updateUser(Users user);

    String deleteUser(Long id);
}