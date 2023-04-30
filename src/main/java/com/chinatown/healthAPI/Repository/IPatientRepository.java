package com.chinatown.healthAPI.Repository;

import com.chinatown.healthAPI.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends JpaRepository <Patient, Long> {
}
