package com.example.station_de_ski2.Service;

import com.example.station_de_ski2.entities.Piste;
import com.example.station_de_ski2.Repositories.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.station_de_ski2.Service.IPisteService;

import java.util.List;

@Service
public class IPistServiceImpl implements IPisteService{
    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

}
