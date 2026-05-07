package com.medicare.hospital.service;

import com.medicare.hospital.entity.Patient;
import com.medicare.hospital.repository.PatientRepository;

public class PatientAdmissionService {
    private final PatientRepository patientRepository;

    // Constructor injection
    public PatientAdmissionService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.savePatient(patient);
    }
}
