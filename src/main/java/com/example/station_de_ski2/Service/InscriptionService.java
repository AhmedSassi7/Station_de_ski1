package com.example.station_de_ski2.Service;
import com.example.station_de_ski2.entities.Cours;
import com.example.station_de_ski2.entities.Inscription;
import java.util.List;
public interface InscriptionService{
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscription (Long numCours);
    void remove(Long id);
}
