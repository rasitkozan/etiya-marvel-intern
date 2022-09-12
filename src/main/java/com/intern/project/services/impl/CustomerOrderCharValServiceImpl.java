package com.intern.project.services.impl;

import com.intern.project.repos.ICustomerOrderCharValRepository;
import com.intern.project.services.ICustomerOrderCharValService;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderCharValServiceImpl implements ICustomerOrderCharValService {
    private final ICustomerOrderCharValRepository customerOrderCharValRepository;

    public CustomerOrderCharValServiceImpl(ICustomerOrderCharValRepository customerOrderCharValRepository) {
        this.customerOrderCharValRepository = customerOrderCharValRepository;
    }
}
