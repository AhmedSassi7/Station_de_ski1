package com.example.station_de_ski2.Service;

import com.example.station_de_ski2.entities.Abonnement;
import com.example.station_de_ski2.entities.Cours;



import java.util.List;

public interface IAbonnementService  {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement retrieveAbonnement(Long numAbonnement);
    void remove(Long id);

}
