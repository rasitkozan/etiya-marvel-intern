package com.intern.project.controllers;

import com.intern.project.services.IGeneralCharService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generalchar")
@RequiredArgsConstructor
public class GeneralCharController {
    private IGeneralCharService generalCharService;
}
