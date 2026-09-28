package com.careerguidance.controller;

import com.careerguidance.model.CareerPath;
import com.careerguidance.service.CareerGuidanceService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://career-guidance-backend-cadc.onrender.com")
@RequestMapping("/api/career-guidance")
public class CareerGuidanceController {

    private final CareerGuidanceService careerGuidanceService;

    public CareerGuidanceController(
            CareerGuidanceService careerGuidanceService) {
        this.careerGuidanceService = careerGuidanceService;
    }

    @GetMapping
    public CareerPath getCareerPath(
            @RequestParam String educationLevel,
            @RequestParam(required = false) String stream,
            @RequestParam(required = false) String interest,
            @RequestParam(required = false) String preferredPath,
            @RequestParam(required = false) String careerGoal) {

        return careerGuidanceService.getCareerPath(
                educationLevel,
                stream,
                interest,
                preferredPath,
                careerGoal
        );
    }
}