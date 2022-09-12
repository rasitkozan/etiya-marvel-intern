package com.intern.project.services.impl;

import com.intern.project.repos.IProductOfferCharRepository;
import com.intern.project.services.IProductOfferCharService;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferCharServiceImpl implements IProductOfferCharService {
    private final IProductOfferCharRepository productOfferCharRepository;

    public ProductOfferCharServiceImpl(IProductOfferCharRepository productOfferCharRepository) {
        this.productOfferCharRepository = productOfferCharRepository;
    }
}
