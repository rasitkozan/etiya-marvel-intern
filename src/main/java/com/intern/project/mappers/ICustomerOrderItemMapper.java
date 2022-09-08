package com.intern.project.mappers;

import com.intern.project.dtos.CustomerOrderItemDto;
import com.intern.project.entities.CustomerOrderItemEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface ICustomerOrderItemMapper {
    ICustomerOrderItemMapper INSTANCE = Mappers.getMapper(ICustomerOrderItemMapper.class);

    CustomerOrderItemEntity customerOrderItemDtoToCustomerOrderItemEntity(CustomerOrderItemDto customerOrderItemDto);
    CustomerOrderItemDto customerOrderItemEntityToCustomerOrderItemDto(CustomerOrderItemEntity customerOrderItemEntity);

    void updateCustomerOrderItemFromDto(CustomerOrderItemDto newCustomerOrderItemDto, @MappingTarget CustomerOrderItemEntity oldCustomerOrderItemEntity);

    List<CustomerOrderItemEntity> fromDtoList(List<CustomerOrderItemDto> customerOrderItemDtoList);
    List<CustomerOrderItemDto> toDtoList(List<CustomerOrderItemEntity> customerOrderItemEntityList);
}
