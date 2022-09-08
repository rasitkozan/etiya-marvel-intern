package com.intern.project.services;

import com.intern.project.dtos.CustomerOrderDto;
import com.intern.project.dtos.customerOrders.CustomerOrderRequest;
import com.intern.project.dtos.customerOrders.CustomerOrder;

public interface ICustomerOrderService {

    public CustomerOrderDto save(CustomerOrderDto customerOrderDto);

    public CustomerOrder continueSelectedOffer(CustomerOrderRequest customerOrderRequest);
}
