package com.intern.project.services.impl;

import com.intern.project.repos.ICustomerOrderCharValRepository;
import com.intern.project.services.ICustomerOrderCharValService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerOrderCharValServiceImpl implements ICustomerOrderCharValService {
    private final ICustomerOrderCharValRepository customerOrderCharValRepository;
}
