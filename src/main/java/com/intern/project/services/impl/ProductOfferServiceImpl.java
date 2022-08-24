package com.intern.project.services.impl;

import com.intern.project.repos.IProductOfferRepository;
import com.intern.project.services.IProductOfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductOfferServiceImpl implements IProductOfferService {
    private final IProductOfferRepository productOfferRepository;
}
