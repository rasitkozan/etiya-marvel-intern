package com.intern.project.dtos.customerOrders;

import com.intern.project.dtos.customerOrderCharVals.CustomerOrderChar;
import com.intern.project.dtos.productOffers.ProductOffer;
import com.intern.project.dtos.users.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {


    //Düzeltilecek
    private User user;
    private List<ProductOffer> productOfferList;
    private List<CustomerOrderChar> customerOrderCharList;
    private String type;
}
