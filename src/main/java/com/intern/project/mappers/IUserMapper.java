package com.intern.project.mappers;

import com.intern.project.dtos.UserDto;
import com.intern.project.dtos.users.User;
import com.intern.project.entities.UserEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface IUserMapper {
    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    UserEntity userDtoToUserEntity(UserDto userDto);

    UserDto userEntityToUserDto(UserEntity userEntity);

    void updateUserFromDto(UserDto newUserDto, @MappingTarget UserEntity oldUserEntity);

    User userDtoToUser(UserDto userDto);
}
