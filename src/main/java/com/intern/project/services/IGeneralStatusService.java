package com.intern.project.services;

import com.intern.project.dtos.GeneralStatusDto;

public interface IGeneralStatusService {
    public GeneralStatusDto create(GeneralStatusDto generalStatusDto);
    public GeneralStatusDto getByShortCode(String shortCode);

    public GeneralStatusDto getById(int id);
}
