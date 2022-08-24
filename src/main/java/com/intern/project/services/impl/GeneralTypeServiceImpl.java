package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralTypeRepository;
import com.intern.project.services.IGeneralTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneralTypeServiceImpl implements IGeneralTypeService {
    private final IGeneralTypeRepository generalTypeRepository;
}
