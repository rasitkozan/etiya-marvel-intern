package com.intern.project.services.impl;

import com.intern.project.repos.IGeneralStatusRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GeneralStatusServiceImplTest {

    GeneralStatusServiceImpl generalStatusService;
    private IGeneralStatusRepository generalStatusRepository;

    @BeforeEach
    void setUp() {

    }
}