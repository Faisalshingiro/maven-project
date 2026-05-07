package com.medicare.hospital.repository;

import com.medicare.hospital.entity.Patient;

public interface PatientRepository {
    Patient savePatient(Patient patient);
}
