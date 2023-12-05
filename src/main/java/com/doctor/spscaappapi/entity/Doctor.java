package com.doctor.spscaappapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long doctorId;
    private String service;
}
