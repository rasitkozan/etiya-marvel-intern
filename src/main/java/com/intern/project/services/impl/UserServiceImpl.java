package com.intern.project.services.impl;

import com.intern.project.repos.IUserRepository;
import com.intern.project.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;
}
