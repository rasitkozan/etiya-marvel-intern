package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralTypeDto implements Serializable {

    private int generalTypeId;
    private String name;
    private String description;
    private String shortCode;
    private String entityCodeName;
    private Boolean isActive;
}
