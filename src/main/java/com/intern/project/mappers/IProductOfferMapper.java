package com.intern.project.mappers;

import com.intern.project.dtos.ProductOfferDto;
import com.intern.project.entities.ProductOfferEntity;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface IProductOfferMapper {
    IProductOfferMapper INSTANCE = Mappers.getMapper(IProductOfferMapper.class);
    ProductOfferDto productOfferEntityToProductOfferDto(ProductOfferEntity productOfferEntity);

}
