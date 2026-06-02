package com.project.user.management.service;

import org.springframework.stereotype.Service;

import com.project.user.management.repository.UsersRepository;

@Service
public class UserServiceImplementation implements UserService {

    private UsersRepository repo;

    public UserServiceImplementation(UsersRepository repo) {
        this.repo = repo;
    }
}