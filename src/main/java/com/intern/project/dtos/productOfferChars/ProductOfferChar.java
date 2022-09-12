package com.intern.project.dtos.productOfferChars;

import com.intern.project.dtos.generalCharVals.GeneralCharVal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfferChar {

    private int charId;
    private String name;
    private String shortCode;
    private int statusId;

    private GeneralCharVal generalCharVal;

    private List<GeneralCharVal> generalCharValList;

}
