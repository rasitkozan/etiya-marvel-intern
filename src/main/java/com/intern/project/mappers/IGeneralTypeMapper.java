package com.intern.project.mappers;

import com.intern.project.dtos.GeneralTypeDto;
import com.intern.project.entities.GeneralTypeEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface IGeneralTypeMapper {
    IGeneralTypeMapper INSTANCE = Mappers.getMapper(IGeneralTypeMapper.class);

    GeneralTypeDto generalTypeEntityToGeneralTypeDto(GeneralTypeEntity generalTypeEntity);
    GeneralTypeEntity generalTypeDtoToGeneralTypeEntity(GeneralTypeDto generalTypeDto);
    void updateGeneralTypeFromDto(GeneralTypeDto newGeneralTypeDto, @MappingTarget GeneralTypeEntity oldGeneralTypeEntity);
}
