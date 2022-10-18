package com.app.testing.module.controller;

import com.app.testing.module.domain.Patient;
import com.app.testing.module.domain.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the patients
 */
@RestController
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(final PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping(value="/patient")
    public void getAllPatients() {
        System.out.println("ver si funciona");
    }

    /**
     * Method to create a patient
     */
    @PostMapping(value="/patient")
    public ResponseEntity<Patient> postPatient(@RequestBody final Patient patient) {
        Patient saved = patientRepository.saveAndFlush(patient);
        return new ResponseEntity<Patient>(saved, HttpStatus.OK);
    }

}
