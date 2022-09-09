package com.intern.project.services.impl;

import com.intern.project.GeneralEnumerationDefinition;
import com.intern.project.dtos.GeneralTypeDto;
import com.intern.project.dtos.UserDto;
import com.intern.project.entities.UserEntity;
import com.intern.project.exceptions.BadRequestException;
import com.intern.project.exceptions.NotFoundException;
import com.intern.project.mappers.IUserMapper;
import com.intern.project.repos.IUserRepository;
import com.intern.project.services.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
    public UserDto inquireUser(UserDto userDto){
        //TODO: inquireUser api'sini call edildiği durumda generalTypeService içerisindeki cache işlemini denemek için eklendi. SİLİNECEK...
        GeneralTypeDto generalTypeDto = generalTypeService
                .getById(userDto.getTypeId());
        UserEntity userEntity = IUserMapper.INSTANCE.userDtoToUserEntity(userDto);
        UserEntity userEntityResponse = userRepository
                .findByUserNameAndPassword(userEntity.getUserName(), userEntity.getPassword());
        return IUserMapper.INSTANCE.userEntityToUserDto(userEntityResponse);
    }

    @Override
    public UserDto create(UserDto userDto) {
        this.createRequestValidation(userDto);
        userDto.setStatusId(generalStatusService
                .getByShortCode(GeneralEnumerationDefinition.AccountStatusShortCode.ACTIVE_USER.getShortCode())
                .getGeneralStatusId());
        userDto.setTypeId(generalTypeService
                .getById(userDto.getTypeId())
                .getGeneralTypeId());
        UserEntity userEntity = IUserMapper.INSTANCE.userDtoToUserEntity(userDto);
        return IUserMapper.INSTANCE.userEntityToUserDto(
                userRepository.save(userEntity)
        );
    }

    @Override
    public List<UserDto> getByTypeShortCode(String shortCode) {
        int typeId = generalTypeService
                .getByShortCode(shortCode)
                .getGeneralTypeId();
        return userRepository.findByTypeId(typeId)
                .stream()
                .map(IUserMapper.INSTANCE::userEntityToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto getById(int id) {

        return IUserMapper.INSTANCE.userEntityToUserDto(checkIfUserExistsById(id));
    }

    private void createRequestValidation(UserDto userDto) {
        if (Objects.isNull(userDto.getUserName()) || Objects.isNull(userDto.getPassword())) {
            throw new BadRequestException("request invalid");
        }
    }

    private UserEntity checkIfUserExistsById(int id) {

            return this.userRepository.findById(id)
                    .orElseThrow(()->new NotFoundException("USERS.NOT.EXISTS"));
    }
}