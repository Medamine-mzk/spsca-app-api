package com.doctor.spscaappapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;

}
