package com.example.station_de_ski2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    int niveau;
    @Enumerated(EnumType.STRING)
    Support support;
    float prix;
    int creneau;
    @OneToMany(mappedBy = "cours")
    List<Inscription> inscriptions;
}
