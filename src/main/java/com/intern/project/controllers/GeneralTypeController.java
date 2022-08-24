package com.intern.project.controllers;

import com.intern.project.services.IGeneralTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generaltype")
@RequiredArgsConstructor
public class GeneralTypeController {
    private IGeneralTypeService generalTypeService;
}
