package com.intern.project.services.impl;

import com.intern.project.repos.ICustomerOrderItemRepository;
import com.intern.project.services.ICustomerOrderItemService;

import org.springframework.stereotype.Service;

@Service
public class CustomerOrderItemServiceImpl implements ICustomerOrderItemService {
    private final ICustomerOrderItemRepository customerOrderItemRepository;

    public CustomerOrderItemServiceImpl(ICustomerOrderItemRepository customerOrderItemRepository) {
        this.customerOrderItemRepository = customerOrderItemRepository;
    }
}
