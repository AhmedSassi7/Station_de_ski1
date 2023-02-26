package com.example.station_de_ski2.Service;
import com.example.station_de_ski2.entities.Abonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.station_de_ski2.Repositories.AbonnementRepository;
import java.util.List;

@Service
public class AbonnementService implements IAbonnementService {

    @Autowired
    private AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return null;
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return null;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return null;
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
