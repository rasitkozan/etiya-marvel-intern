package com.intern.project.controllers;

import com.intern.project.services.IProductOfferService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productoffer")
public class ProductOfferController {
    private IProductOfferService productOfferService;

    public ProductOfferController(IProductOfferService productOfferService) {
        this.productOfferService = productOfferService;
    }
}
