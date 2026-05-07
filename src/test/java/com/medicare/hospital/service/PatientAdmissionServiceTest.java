package com.medicare.hospital.service;

import com.medicare.hospital.entity.Patient;
import com.medicare.hospital.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PatientAdmissionServiceTest {

    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientAdmissionService patientAdmissionService;

    @Test
    public void testSavePatient_WithMockAnnotation() {
        // 1. Define the expected behavior of the mocked repository
        Patient patient = new Patient(101, "Faisal", "Shingiro", 30);
        when(patientRepository.savePatient(any(Patient.class))).thenReturn(patient);

        // 2. Invoke savePatient() through the service layer
        Patient savedPatient = patientAdmissionService.savePatient(patient);

        // 3. Assert that at least one field of the returned patient matches the expected value
        assertEquals("Faisal", savedPatient.getFirstName(), "The first name should match the expected value.");
        assertEquals(101, savedPatient.getPatientId(), "The patient ID should match the expected value.");

        // 4. Verify that the mocked repository's savePatient() method was indeed called during execution
        verify(patientRepository, times(1)).savePatient(patient);
    }
}
