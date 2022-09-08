package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfferCharDto {

    private int productOfferCharId;
    private int productOfferId;
    private ProductOfferDto productOfferDto;
    private int charId;
    private GeneralCharDto generalCharDto;
    private String name;
    private int statusId;
    private GeneralStatusDto generalStatusDto;
    private String shortCode;
    private String description;


}
