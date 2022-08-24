package com.intern.project.controllers;

import com.intern.project.services.IGeneralCharValService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generalcharval")
@RequiredArgsConstructor
public class GeneralCharValController {
    private IGeneralCharValService generalCharValService;
}
