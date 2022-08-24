package com.intern.project.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int userId;
    private String screenName;
    private String password;
    private String userName;
    private int statusId;
    private GeneralStatusDto generalStatusDto;
    private int typeId;
    private GeneralTypeDto generalTypeDto;

}
