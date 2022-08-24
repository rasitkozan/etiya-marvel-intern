package com.intern.project.services.impl;

import com.intern.project.repos.IUserRepository;
import com.intern.project.services.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
