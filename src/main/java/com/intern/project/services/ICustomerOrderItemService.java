package com.intern.project.services;

import com.intern.project.dtos.CustomerOrderItemDto;

import java.util.List;

public interface ICustomerOrderItemService {

    public CustomerOrderItemDto save(CustomerOrderItemDto customerOrderItemDto);

    public List<CustomerOrderItemDto> saveAll(List<CustomerOrderItemDto> customerOrderItemDtoList);
}
