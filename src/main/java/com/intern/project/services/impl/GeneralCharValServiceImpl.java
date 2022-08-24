package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralCharValRepository;
import com.intern.project.services.IGeneralCharValService;
import org.springframework.stereotype.Service;

@Service
public class GeneralCharValServiceImpl implements IGeneralCharValService {
    private final IGeneralCharValRepository generalCharValRepository;

    public GeneralCharValServiceImpl(IGeneralCharValRepository generalCharValRepository) {
        this.generalCharValRepository = generalCharValRepository;
    }
}
