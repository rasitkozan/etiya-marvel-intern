package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralStatusDto {

    private int generalStatusId;
    private String name;
    private String description;
    private int shortCode;
    private int entityCodeName;
    private int isActive;
}


