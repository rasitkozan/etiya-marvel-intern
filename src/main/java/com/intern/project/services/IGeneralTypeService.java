package com.intern.project.services;

import com.intern.project.dtos.GeneralTypeDto;

public interface IGeneralTypeService {
    public GeneralTypeDto create(GeneralTypeDto generalTypeDto) ;
    public GeneralTypeDto getByShortCode(String shortCode);
    public GeneralTypeDto getById(int id);
}
