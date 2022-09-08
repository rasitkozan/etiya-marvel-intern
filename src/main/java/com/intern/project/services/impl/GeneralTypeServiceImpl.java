package com.intern.project.services.impl;

import com.intern.project.dtos.GeneralTypeDto;
import com.intern.project.mappers.IGeneralTypeMapper;
import com.intern.project.repos.IGeneralTypeRepository;
import com.intern.project.services.IGeneralTypeService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static com.intern.project.GeneralEnumerationDefinition.STATUS_ACTIVE;


@Service
public class GeneralTypeServiceImpl implements IGeneralTypeService {
    private final IGeneralTypeRepository generalTypeRepository;

    public GeneralTypeServiceImpl(IGeneralTypeRepository generalTypeRepository) {
        this.generalTypeRepository = generalTypeRepository;
    }

    @Override
    public GeneralTypeDto create(GeneralTypeDto generalTypeDto) {
        generalTypeDto.setIsActive(STATUS_ACTIVE);
        return IGeneralTypeMapper.INSTANCE
                .generalTypeEntityToGeneralTypeDto(generalTypeRepository
                        .save(IGeneralTypeMapper.INSTANCE
                .generalTypeDtoToGeneralTypeEntity(generalTypeDto)));
    }

    @Override
    public GeneralTypeDto getByShortCode(String shortCode) {
        return IGeneralTypeMapper.INSTANCE
                .generalTypeEntityToGeneralTypeDto(generalTypeRepository
                        .getByShortCode(shortCode));
    }

    @Cacheable(value = "generalTypeCache", key = "#typeId")
    @Override
    public GeneralTypeDto getById(int typeId) {
        return generalTypeRepository
                .findById(typeId)
                .map(IGeneralTypeMapper.INSTANCE::generalTypeEntityToGeneralTypeDto)
                .orElseThrow(() -> new NullPointerException());
    }
}
