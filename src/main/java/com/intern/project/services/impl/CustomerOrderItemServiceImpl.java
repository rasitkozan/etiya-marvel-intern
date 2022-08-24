package com.intern.project.services.impl;

import com.intern.project.repos.ICustomerOrderItemRepository;
import com.intern.project.services.ICustomerOrderService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerOrderItemServiceImpl implements ICustomerOrderService {
    private final ICustomerOrderItemRepository customerOrderItemRepository;
}
