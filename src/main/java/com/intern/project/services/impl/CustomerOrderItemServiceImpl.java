package com.intern.project.services.impl;

import com.intern.project.dtos.CustomerOrderItemDto;
import com.intern.project.entities.CustomerOrderItemEntity;
import com.intern.project.mappers.ICustomerOrderItemMapper;
import com.intern.project.mappers.ICustomerOrderMapper;
import com.intern.project.repos.ICustomerOrderItemRepository;
import com.intern.project.services.ICustomerOrderItemService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderItemServiceImpl implements ICustomerOrderItemService {
    private final ICustomerOrderItemRepository customerOrderItemRepository;

    public CustomerOrderItemServiceImpl(ICustomerOrderItemRepository customerOrderItemRepository) {
        this.customerOrderItemRepository = customerOrderItemRepository;
    }

    @Override
    public CustomerOrderItemDto save(CustomerOrderItemDto customerOrderItemDto) {
        CustomerOrderItemEntity customerOrderItemEntity = ICustomerOrderItemMapper
                .INSTANCE.customerOrderItemDtoToCustomerOrderItemEntity(customerOrderItemDto);
        return ICustomerOrderItemMapper
                .INSTANCE.customerOrderItemEntityToCustomerOrderItemDto(this.customerOrderItemRepository.save(customerOrderItemEntity));
    }

    public List<CustomerOrderItemDto> saveAll(List<CustomerOrderItemDto> customerOrderItemDtoList){
        return ICustomerOrderItemMapper.INSTANCE.toDtoList(
            this.customerOrderItemRepository.saveAll(ICustomerOrderItemMapper.INSTANCE.fromDtoList(customerOrderItemDtoList))
        );
    }
}