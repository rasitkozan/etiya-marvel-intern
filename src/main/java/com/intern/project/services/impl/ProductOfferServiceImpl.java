package com.intern.project.services.impl;

import com.intern.project.repos.IProductOfferRepository;
import com.intern.project.services.IProductOfferService;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferServiceImpl implements IProductOfferService {
    private final IProductOfferRepository productOfferRepository;

    public ProductOfferServiceImpl(IProductOfferRepository productOfferRepository) {
        this.productOfferRepository = productOfferRepository;
    }
}
