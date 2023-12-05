package com.doctor.spscaappapi.controller;

import com.doctor.spscaappapi.entity.Doctor;
import com.doctor.spscaappapi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    // Save operation
    @PostMapping("/doctors")
    public Doctor saveDoctor(@RequestBody Doctor doctor)
    {
        return doctorService.saveDoctor(doctor);
    }
    // Read operation
    @GetMapping("/doctors")
    public List<Doctor> fetchDoctorList()
    {
        return doctorService.fetchDoctorList();
    }
    // Update operation
    @PutMapping("/doctors/{id}")
    public Doctor updateDepartment(@RequestBody Doctor doctor,
                            @PathVariable("id") Long doctorId)
    {
        return doctorService.updateDoctor(doctor, doctorId);
    }

    // Delete operation
    @DeleteMapping("/doctors/{id}")
    public String deleteDoctorById(@PathVariable("id")
                                       Long doctorId)
    {
        doctorService.deleteDoctorById(
                doctorId);
        return "Deleted Successfully";
    }
}
