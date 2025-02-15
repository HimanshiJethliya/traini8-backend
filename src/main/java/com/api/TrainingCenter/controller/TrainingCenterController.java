/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.TrainingCenter.controller;

/**
 *
 * @author jethl
 */

import com.api.TrainingCenter.model.TrainingCenter;
import com.api.TrainingCenter.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedTrainingCenter = service.createTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedTrainingCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = service.getAllTrainingCenters();
        return new ResponseEntity<>(trainingCenters, HttpStatus.OK);
    }
}