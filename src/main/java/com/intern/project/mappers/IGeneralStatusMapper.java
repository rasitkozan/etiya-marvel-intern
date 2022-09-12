package com.intern.project.mappers;

import com.intern.project.dtos.GeneralStatusDto;
import com.intern.project.entities.GeneralStatusEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IGeneralStatusMapper {
    IGeneralStatusMapper INSTANCE = Mappers.getMapper(IGeneralStatusMapper.class);
    GeneralStatusEntity toEntity(GeneralStatusDto generalStatusDto);
    GeneralStatusDto toDto(GeneralStatusEntity generalStatusEntity);
    void updateGeneralStatusFromDto(GeneralStatusDto newGeneralStatusDto, @MappingTarget GeneralStatusEntity oldGeneralStatusEntity);
}
