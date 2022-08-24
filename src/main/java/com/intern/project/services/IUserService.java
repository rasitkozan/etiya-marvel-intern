package com.intern.project.services;

import com.intern.project.dtos.UserDto;

public interface IUserService {
    public UserDto inquireUser(UserDto userDto);

    public UserDto create(UserDto userDto);
}
