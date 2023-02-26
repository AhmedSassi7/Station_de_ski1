package com.example.station_de_ski2.Service;
import com.example.station_de_ski2.entities.Moniteur;
//import com.example.station_de_ski2.Generic.IGenericService;
import java.util.List;
public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}
