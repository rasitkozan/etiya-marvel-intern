package com.intern.project.mappers;

import com.intern.project.dtos.CustomerOrderDto;
import com.intern.project.entities.CustomerOrderEntity;
import com.intern.project.dtos.customerOrders.CustomerOrderRequest;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface ICustomerOrderMapper {
    ICustomerOrderMapper INSTANCE = Mappers.getMapper(ICustomerOrderMapper.class);
    CustomerOrderEntity customerOrderDtoToCustomerOrderEntity(CustomerOrderDto customerOrderDto);
    CustomerOrderDto customerOrderRequestToCustomerOrderDto(CustomerOrderRequest customerOrderRequest);
    CustomerOrderDto customerOrderEntityToCustomerOrderDto(CustomerOrderEntity customerOrderEntity);
    void updateCustomerOrderFromDto(CustomerOrderDto newCustomerOrderDto, @MappingTarget CustomerOrderEntity oldCustomerOrderEntity);


}
