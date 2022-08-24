package com.intern.project.services.impl;

import com.intern.project.dtos.GeneralStatusDto;
import com.intern.project.mappers.IGeneralStatusMapper;
import com.intern.project.repos.IGeneralStatusRepository;
import com.intern.project.services.IGeneralStatusService;
import org.springframework.stereotype.Service;

import static com.intern.project.Constants.STATUS_ACTIVE;

@Service
public class GeneralStatusServiceImpl implements IGeneralStatusService {
    private final IGeneralStatusRepository generalStatusRepository;

    public GeneralStatusServiceImpl(IGeneralStatusRepository generalStatusRepository) {
        this.generalStatusRepository = generalStatusRepository;
    }
    
    @Override
    public GeneralStatusDto create(GeneralStatusDto generalStatusDto) {
        generalStatusDto.setIsActive(STATUS_ACTIVE);
        return IGeneralStatusMapper.INSTANCE
                .toDto(generalStatusRepository
                        .save(IGeneralStatusMapper.INSTANCE
                .toEntity(generalStatusDto)));
    }

    @Override
    public GeneralStatusDto getByShortCode(String shortCode) {
        return IGeneralStatusMapper.INSTANCE
                .toDto(generalStatusRepository
                        .getByShortCode(shortCode));
    }
}
