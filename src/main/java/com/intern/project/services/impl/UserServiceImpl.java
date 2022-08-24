package com.intern.project.services.impl;

import com.intern.project.dtos.UserDto;
import com.intern.project.entities.UserEntity;
import com.intern.project.mappers.IUserMapper;
import com.intern.project.repos.IUserRepository;
import com.intern.project.services.IUserService;
import org.springframework.stereotype.Service;

import static com.intern.project.Constants.STATUS_SHORT_CODE_ACTIVE;

@Service
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;
    private final GeneralStatusServiceImpl generalStatusService;
    private final GeneralTypeServiceImpl generalTypeService;

    public UserServiceImpl(IUserRepository userRepository, GeneralStatusServiceImpl generalStatusService, GeneralTypeServiceImpl generalTypeService) {
        this.userRepository = userRepository;
        this.generalStatusService = generalStatusService;
        this.generalTypeService = generalTypeService;
    }

    @Override
    public UserDto inquireUser(UserDto userDto) {

        UserEntity userEntity = IUserMapper.INSTANCE.userDtoToUserEntity(userDto);
        UserEntity userEntityResponse = userRepository
                .findByUserNameAndPassword(userEntity.getUserName(), userEntity.getPassword());

        return IUserMapper.INSTANCE.userEntityToUserDto(userEntityResponse);

    }

    @Override
    public UserDto create(UserDto userDto) {
        userDto.setStatusId(generalStatusService
                .getByShortCode(STATUS_SHORT_CODE_ACTIVE)
                .getGeneralStatusId());
        userDto.setTypeId(generalTypeService
                .getById(userDto.getTypeId())
                .getGeneralTypeId());
        UserEntity userEntity = IUserMapper.INSTANCE.userDtoToUserEntity(userDto);
        UserEntity testEntity = new UserEntity();
        return IUserMapper.INSTANCE.userEntityToUserDto(
                userRepository.save(userEntity)
        );
    }
}
