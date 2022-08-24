package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralCharRepository;
import com.intern.project.services.IGeneralCharService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneralCharServiceImpl implements IGeneralCharService {
    private  IGeneralCharRepository generalCharRepository;
}
