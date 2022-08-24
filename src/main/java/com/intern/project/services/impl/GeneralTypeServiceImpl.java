package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralTypeRepository;
import com.intern.project.services.IGeneralTypeService;
import org.springframework.stereotype.Service;

@Service
public class GeneralTypeServiceImpl implements IGeneralTypeService {
    private final IGeneralTypeRepository generalTypeRepository;

    public GeneralTypeServiceImpl(IGeneralTypeRepository generalTypeRepository) {
        this.generalTypeRepository = generalTypeRepository;
    }
}
