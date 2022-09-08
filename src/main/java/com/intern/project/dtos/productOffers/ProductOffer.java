package com.intern.project.dtos.productOffers;

import com.intern.project.dtos.productOfferChars.ProductOfferChar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOffer {

    private int productOfferId;
    private int productOfferTypeId;
    List<ProductOfferChar> productOfferCharList;
    private String name;
    private String description;
    private int statusId;

}
