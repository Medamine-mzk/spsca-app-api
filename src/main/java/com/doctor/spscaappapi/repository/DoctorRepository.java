package com.doctor.spscaappapi.repository;

import com.doctor.spscaappapi.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Long> {

}
