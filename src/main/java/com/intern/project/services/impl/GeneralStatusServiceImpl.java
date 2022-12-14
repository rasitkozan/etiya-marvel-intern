package com.intern.project.services.impl;

import com.intern.project.dtos.GeneralStatusDto;
import com.intern.project.entities.GeneralStatusEntity;
import com.intern.project.exceptions.NotFoundException;
import com.intern.project.mappers.IGeneralStatusMapper;
import com.intern.project.repos.IGeneralStatusRepository;
import com.intern.project.services.IGeneralStatusService;
import org.springframework.stereotype.Service;

import static com.intern.project.GeneralEnumerationDefinition.STATUS_ACTIVE;

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
        //TODO: getByShortCode yerine getByShortCodeAndEntityCodeName ile birlikte olacak şekilde güncellenecek.
        return generalStatusRepository
                .getByShortCodeAndEntityCodeName(shortCode,"usr")
                .map(IGeneralStatusMapper.INSTANCE::toDto)
                .orElseThrow(() -> new NotFoundException("status not found"));
    }

    @Override
    public GeneralStatusDto getById(int id) {
        return IGeneralStatusMapper.INSTANCE.toDto(checkIfGeneralStatusExistsById(id));
    }

    private GeneralStatusEntity checkIfGeneralStatusExistsById(int id){
        return this.generalStatusRepository.findById(id)
                .orElseThrow(()->new NotFoundException("STATUSES.NOT.EXISTS"));
    }


}
