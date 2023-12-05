package com.doctor.spscaappapi.service;

import com.doctor.spscaappapi.entity.Doctor;
import com.doctor.spscaappapi.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> fetchDoctorList() {
        return (List<Doctor>)doctorRepository.findAll();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor, Long doctorId) {
        Doctor doc = doctorRepository.findById(doctorId).get();
        doc.setNom(doctor.getNom());
        doc.setPrenom(doctor.getPrenom());
        doc.setEmail(doctor.getEmail());
        return doctorRepository.save(doc);
    }

    @Override
    public void deleteDoctorById(Long doctorId) {
        doctorRepository.deleteById(doctorId);
    }
}
