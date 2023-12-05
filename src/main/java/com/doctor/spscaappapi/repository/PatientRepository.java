package com.doctor.spscaappapi.repository;

import com.doctor.spscaappapi.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Long> {

}
