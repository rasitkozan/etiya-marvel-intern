package com.intern.project.services.impl;

import com.intern.project.repos.IUserRepository;
import com.intern.project.services.IGeneralStatusService;
import com.intern.project.services.IGeneralTypeService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    UserServiceImpl userService;

    private IUserRepository userRepository;
    private GeneralStatusServiceImpl generalStatusService;
    private GeneralTypeServiceImpl generalTypeService;

    @BeforeEach
    void setUp() throws Exception {
        userRepository = Mockito.mock(IUserRepository.class);
        generalStatusService = Mockito.mock(GeneralStatusServiceImpl.class);
        generalTypeService = Mockito.mock(GeneralTypeServiceImpl.class);
     //   userService = new UserServiceImpl(userRepository, generalStatusService, generalTypeService);
    }


}