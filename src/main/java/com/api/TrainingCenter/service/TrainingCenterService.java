/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.TrainingCenter.service;

/**
 *
 * @author jethl
 */

import com.api.TrainingCenter.model.TrainingCenter;
import com.api.TrainingCenter.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(Instant.now());
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
