package com.intern.project.dtos.customerOrders;

import com.intern.project.dtos.productOffers.ProductOffer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderRequest {

    private int userId;
    List<ProductOffer> productOfferList;

}
