package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralCharDto {

    private int generalCharId;
    private String name;
    private String shortCode;
    private String description;
    private int statusId;
    private GeneralStatusDto generalStatusDto;

}
