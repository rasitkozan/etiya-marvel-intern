package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralTypeDto {

    private int generalTypeId;
    private String name;
    private String description;
    private String shortCode;
    private String entityCodeName;
    private Boolean isActive;
}
