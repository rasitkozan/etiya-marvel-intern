package com.intern.project.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralCharValDto {

    private int generalCharValId;
    private int charId;
    private GeneralCharDto generalCharDto;
    private String name;
    private String shortCode;
    private String description;
    private String val;
    private int statusId;
    private GeneralStatusDto generalStatusDto;
    private Boolean default_selected;
}
