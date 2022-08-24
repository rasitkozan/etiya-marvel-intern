package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralStatusRepository;
import com.intern.project.services.IGeneralStatusService;
import org.springframework.stereotype.Service;

@Service
public class GeneralStatusServiceImpl implements IGeneralStatusService {
    private final IGeneralStatusRepository generalStatusRepository;

    public GeneralStatusServiceImpl(IGeneralStatusRepository generalStatusRepository) {
        this.generalStatusRepository = generalStatusRepository;
    }
}
