package com.intern.project.controllers;

import com.intern.project.services.IProductOfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productoffer")
@RequiredArgsConstructor
public class ProductOfferController {
    private IProductOfferService productOfferService;
}
