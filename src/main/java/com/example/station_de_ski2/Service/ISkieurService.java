package com.example.station_de_ski2.Service;

import com.example.station_de_ski2.entities.Skieur;

import java.util.List;
public interface ISkieurService {
    void add (Skieur s);

    Skieur update(Skieur s);

    List<Skieur> getAll();

    Skieur getById(long id);

    void remove(long id);
}
