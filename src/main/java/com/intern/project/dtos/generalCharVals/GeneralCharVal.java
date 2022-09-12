package com.intern.project.dtos.generalCharVals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralCharVal {

    private int generalCharValId;
    private String name;
    private String shortCode;
    private String value;
    private Boolean default_selected;
}
