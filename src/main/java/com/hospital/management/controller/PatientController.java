package com.hospital.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.entity.Patient;
import com.hospital.management.repository.PatientRepository;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientRepository repo;

    @GetMapping
    public List<Patient> getAllPatients() {

        return repo.findAll();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {

        return repo.save(patient);
    }
}