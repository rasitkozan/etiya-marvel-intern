package com.intern.project.controllers;

import com.intern.project.services.ICustomerOrderCharValService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customerordercharval")
@RequiredArgsConstructor
public class CustomerOrderCharValController {
    private ICustomerOrderCharValService customerOrderCharValService;



}
