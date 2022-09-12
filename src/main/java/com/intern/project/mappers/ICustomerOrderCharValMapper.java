package com.intern.project.mappers;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface ICustomerOrderCharValMapper {
    ICustomerOrderCharValMapper INSTANCE = Mappers.getMapper(ICustomerOrderCharValMapper.class);
}
