package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralCharRepository;
import com.intern.project.services.IGeneralCharService;
import org.springframework.stereotype.Service;

@Service
public class GeneralCharServiceImpl implements IGeneralCharService {
    private  IGeneralCharRepository generalCharRepository;

    public GeneralCharServiceImpl(IGeneralCharRepository generalCharRepository) {
        this.generalCharRepository = generalCharRepository;
    }
}
