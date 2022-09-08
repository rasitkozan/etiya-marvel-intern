package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfferDto {

    private int productOfferId;
    private String name;
    private String description;
    private int statusId;
    private GeneralStatusDto generalStatusDto;
    private int typeId;
    private GeneralTypeDto generalTypeDto;

}
