package com.chinatown.healthAPI.Service;

import com.chinatown.healthAPI.Model.Patient;
import com.chinatown.healthAPI.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService {

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient findPatient(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
}
