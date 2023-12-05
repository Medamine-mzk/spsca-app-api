package com.doctor.spscaappapi.service;

import com.doctor.spscaappapi.entity.Doctor;

import java.util.List;

public interface DoctorService {
    // Save operation
    Doctor saveDoctor(Doctor department);
    // Read operation
    List<Doctor> fetchDoctorList();
    // Update operation
    Doctor updateDoctor(Doctor doctor, Long doctorId);
    // Delete operation
    void deleteDoctorById(Long doctorId);
}
