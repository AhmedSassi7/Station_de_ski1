package com.example.station_de_ski2.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.station_de_ski2.entities.Cours;
import com.example.station_de_ski2.Repositories.CoursRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ICoursServiceImpl implements ICoursService {
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return null;
    }

    @Override
    public Cours addCours(Cours cours) {
        return null;
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return null;
    }
}
