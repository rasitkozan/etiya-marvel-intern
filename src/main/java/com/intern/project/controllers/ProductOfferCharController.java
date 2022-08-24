package com.intern.project.controllers;

import com.intern.project.services.IProductOfferCharService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productoffercharval")
@RequiredArgsConstructor
public class ProductOfferCharController {
    private IProductOfferCharService productOfferCharService;
}
