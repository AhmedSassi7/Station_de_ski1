package com.example.station_de_ski2.Service;

import com.example.station_de_ski2.Repositories.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.station_de_ski2.entities.Inscription;

import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Service
public class InscriptionServiceImpl implements InscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return null;
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return null;
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return null;
    }

    @Override
    public Inscription retrieveInscription(Long numCours) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
