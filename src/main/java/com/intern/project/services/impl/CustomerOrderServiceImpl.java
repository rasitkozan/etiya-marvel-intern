package com.intern.project.services.impl;

import com.intern.project.repos.ICustomerOrderRepository;
import com.intern.project.services.ICustomerOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerOrderServiceImpl implements ICustomerOrderService {
    private final ICustomerOrderRepository customerOrderRepository;
}
