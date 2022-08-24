package com.intern.project.services.impl;

import com.intern.project.repos.ICustomerOrderRepository;
import com.intern.project.services.ICustomerOrderService;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements ICustomerOrderService {
    private final ICustomerOrderRepository customerOrderRepository;

    public CustomerOrderServiceImpl(ICustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }
}
