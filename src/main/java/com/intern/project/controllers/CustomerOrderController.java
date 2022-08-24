package com.intern.project.controllers;

import com.intern.project.services.ICustomerOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customerorder")
public class CustomerOrderController {
    private final ICustomerOrderService customerOrderService;

    public CustomerOrderController(ICustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }
}
