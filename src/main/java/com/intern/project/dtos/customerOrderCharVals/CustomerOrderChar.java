package com.intern.project.dtos.customerOrderCharVals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderChar {

    private int charId;
    private int charValId;
    private String name;
    private String shortCode;
    private String value;

}
