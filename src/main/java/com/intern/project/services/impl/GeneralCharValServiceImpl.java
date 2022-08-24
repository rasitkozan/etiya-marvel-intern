package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralCharValRepository;
import com.intern.project.services.IGeneralCharValService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneralCharValServiceImpl implements IGeneralCharValService {
    private final IGeneralCharValRepository generalCharValRepository;
}
