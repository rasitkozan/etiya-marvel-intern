package com.intern.project.services;
import com.intern.project.dtos.UserDto;
import java.util.List;
public interface IUserService {
    public UserDto inquireUser(UserDto userDto);
    public UserDto create(UserDto userDto);
    public List<UserDto> getByTypeShortCode(String shortCode);
}