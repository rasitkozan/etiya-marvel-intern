package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralStatusRepository;
import com.intern.project.services.IGeneralStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneralStatusServiceImpl implements IGeneralStatusService {
    private final IGeneralStatusRepository generalStatusRepository;
}
