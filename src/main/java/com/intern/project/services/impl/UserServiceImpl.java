package com.intern.project.services.impl;

import com.intern.project.dtos.UserDto;
import com.intern.project.entities.UserEntity;
import com.intern.project.mappers.IUserMapper;
import com.intern.project.repos.IUserRepository;
import com.intern.project.services.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;


    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public UserDto inquireUser(UserDto userDto) {

        UserEntity userEntity = IUserMapper.INSTANCE.userDtoToUserEntity(userDto);
        UserEntity userEntityResponse = userRepository
                .findByUserNameAndPassword(userEntity.getUserName(), userEntity.getPassword());

        return IUserMapper.INSTANCE.userEntityToUserDto(userEntityResponse);

    }
}
