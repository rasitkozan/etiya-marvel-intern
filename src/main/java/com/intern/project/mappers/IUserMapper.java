package com.intern.project.mappers;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

// null gelirse eski veriyi tutuyor
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
// Strategy for propagating the value of
// collection-typed properties from source to target.
//https://mapstruct.org/documentation/1.0/api/org/mapstruct/CollectionMappingStrategy.html
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface IUserMapper {
    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);
}
