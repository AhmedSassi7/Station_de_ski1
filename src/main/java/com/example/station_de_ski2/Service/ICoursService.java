package com.example.station_de_ski2.Service;
import com.example.station_de_ski2.entities.Cours;

import java.util.List;
public interface ICoursService {
    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    Cours retrieveCours(Long numCours);
}
