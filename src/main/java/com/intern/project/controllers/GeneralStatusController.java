package com.intern.project.controllers;

import com.intern.project.services.IGeneralStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generalstatus")
@RequiredArgsConstructor
public class GeneralStatusController {
    private IGeneralStatusService generalStatusService;
}
