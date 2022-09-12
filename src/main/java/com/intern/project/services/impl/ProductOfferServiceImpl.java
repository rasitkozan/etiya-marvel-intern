package com.intern.project.services.impl;

import com.intern.project.dtos.ProductOfferDto;
import com.intern.project.entities.ProductOfferEntity;
import com.intern.project.exceptions.NotFoundException;
import com.intern.project.mappers.IProductOfferMapper;
import com.intern.project.repos.IProductOfferRepository;
import com.intern.project.services.IProductOfferService;
import org.springframework.stereotype.Service;

@Service
public class ProductOfferServiceImpl implements IProductOfferService {
    private final IProductOfferRepository productOfferRepository;

    public ProductOfferServiceImpl(IProductOfferRepository productOfferRepository) {
        this.productOfferRepository = productOfferRepository;
    }

    @Override
    public ProductOfferDto getById(int id) {
       return IProductOfferMapper.INSTANCE.productOfferEntityToProductOfferDto(checkIfProductOfferExistsById(id));
    }

    private ProductOfferEntity checkIfProductOfferExistsById(int id) {

        return this.productOfferRepository.findById(id)
                .orElseThrow(()->new NotFoundException("PRODUCTOFFERS.NOT.EXISTS"));
    }


}
