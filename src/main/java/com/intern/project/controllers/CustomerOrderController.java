package com.intern.project.controllers;

import com.intern.project.services.ICustomerOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customerorder")
@RequiredArgsConstructor
public class CustomerOrderController {
    private ICustomerOrderService customerOrderService;
}
