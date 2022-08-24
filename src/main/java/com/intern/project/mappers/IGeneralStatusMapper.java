package com.intern.project.mappers;

import com.intern.project.dtos.GeneralStatusDto;
import com.intern.project.dtos.UserDto;
import com.intern.project.entities.GeneralStatusEntity;
import com.intern.project.entities.UserEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface IGeneralStatusMapper {
    IGeneralStatusMapper INSTANCE = Mappers.getMapper(IGeneralStatusMapper.class);
    GeneralStatusEntity generalStatusDtoToGeneralStatusEntity(GeneralStatusDto generalStatusDto);
    GeneralStatusDto generalStatusEntityToGeneralStatusDto(GeneralStatusEntity generalStatusEntity);
    void updateGeneralStatusFromDto(GeneralStatusDto newGeneralStatusDto, @MappingTarget GeneralStatusEntity oldGeneralStatusEntity);
}
