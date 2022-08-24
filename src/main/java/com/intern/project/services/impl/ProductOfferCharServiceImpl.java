package com.intern.project.services.impl;

import com.intern.project.repos.IProductOfferCharRepository;
import com.intern.project.services.IProductOfferCharService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductOfferCharServiceImpl implements IProductOfferCharService {
    private final IProductOfferCharRepository productOfferCharRepository;
}
