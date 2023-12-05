package com.doctor.spscaappapi.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class User {

    String nom;
    String prenom;
    String email;
}
