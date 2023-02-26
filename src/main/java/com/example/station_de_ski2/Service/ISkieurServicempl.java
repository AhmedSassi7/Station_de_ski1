package com.example.station_de_ski2.Service;

import com.example.station_de_ski2.entities.Skieur;
import com.example.station_de_ski2.Repositories.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.station_de_ski2.Service.ISkieurService;

import java.util.List;

@Service
public class ISkieurServicempl implements ISkieurService {
    @Autowired
    private SkieurRepository skieurRepository;

    @Override
    public void add(Skieur s) {
        skieurRepository.save(s);
    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public List<Skieur> getAll() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getById(long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        skieurRepository.deleteById(id);
    }
}
