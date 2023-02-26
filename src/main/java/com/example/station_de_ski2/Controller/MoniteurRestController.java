package com.example.station_de_ski2.Controller;

import com.example.station_de_ski2.Service.IMoniteurService;
import org.springframework.web.bind.annotation.*;
import com.example.station_de_ski2.entities.Moniteur;


import java.util.List;

@RestController
@RequestMapping("/moniteurs")
public class MoniteurRestController {

    private IMoniteurService moniteurService;

    @GetMapping
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurService.retrieveAllMoniteurs();
    }

    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }

    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(moniteur);
    }

    @GetMapping("/{numMoniteur}")
    public Moniteur retrieveMoniteur(@PathVariable Long numMoniteur) {
        return moniteurService.retrieveMoniteur(numMoniteur);
    }

    @DeleteMapping("/{numMoniteur}")
    public void deleteMoniteur(@PathVariable Long numMoniteur) {
        moniteurService.retrieveMoniteur(numMoniteur);
    }
}
