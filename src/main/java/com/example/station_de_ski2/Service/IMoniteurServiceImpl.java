package com.example.station_de_ski2.Service;

import org.springframework.stereotype.Service;
import com.example.station_de_ski2.entities.Moniteur;

import com.example.station_de_ski2.Repositories.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service

public class IMoniteurServiceImpl implements IMoniteurService{
    @Autowired
    private MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}
