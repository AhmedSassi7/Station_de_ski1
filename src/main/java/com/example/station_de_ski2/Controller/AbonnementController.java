package com.example.station_de_ski2.Controller;

import com.example.station_de_ski2.Repositories.AbonnementRepository;
import com.example.station_de_ski2.Service.AbonnementService;
import com.example.station_de_ski2.Service.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.station_de_ski2.entities.Abonnement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/abonnement")
public class AbonnementController{

    private AbonnementService iAbonnementService;
    @PostMapping
    public Abonnement add(@RequestBody Abonnement p) {
        return iAbonnementService.addAbonnement(p);
    }
    @PutMapping("/update")
    public Abonnement update(@RequestBody Abonnement p) {
        return iAbonnementService.updateAbonnement(p);
    }

    @GetMapping("/get/{id}")
    public Abonnement get(@PathVariable("id") Long id) {
        return iAbonnementService.retrieveAbonnement(id);
    }

    @GetMapping("/getAll")
    public List<Abonnement> getAll() {
        return iAbonnementService.retrieveAllAbonnements();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iAbonnementService.remove(id);
    }

}
