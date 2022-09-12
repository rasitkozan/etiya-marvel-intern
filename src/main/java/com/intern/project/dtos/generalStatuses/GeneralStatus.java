package com.intern.project.dtos.generalStatuses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralStatus {

    private int generalStatusId;
    private String name;
    private String description;
    private String shortCode;
    private String entityCodeName;
    private Boolean isActive;
}
