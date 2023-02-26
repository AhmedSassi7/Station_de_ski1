package com.example.station_de_ski2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numAbo;
    LocalDate dateDebut;
    LocalDate DateFin;
    float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon;
}
