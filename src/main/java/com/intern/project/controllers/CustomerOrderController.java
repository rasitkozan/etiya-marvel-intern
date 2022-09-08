package com.intern.project.controllers;

import com.intern.project.dtos.customerOrders.CustomerOrderRequest;
import com.intern.project.dtos.customerOrders.CustomerOrder;
import com.intern.project.services.ICustomerOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customerorder")
public class CustomerOrderController {
    private final ICustomerOrderService customerOrderService;

    public CustomerOrderController(ICustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    @PostMapping("/continueSelectedOrder")
    public ResponseEntity<CustomerOrder> continueSelectedOrder(@RequestBody CustomerOrderRequest customerOrderRequest){

        return ResponseEntity.ok(customerOrderService.continueSelectedOffer(customerOrderRequest));
    }
}
