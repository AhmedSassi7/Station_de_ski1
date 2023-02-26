package com.example.station_de_ski2.Controller;

import com.example.station_de_ski2.Service.IPisteService;
import org.springframework.web.bind.annotation.*;
import com.example.station_de_ski2.entities.Piste;


import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteRestController {


    private IPisteService pisteService;

    @GetMapping
    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }

    @PostMapping
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }

    @GetMapping("/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste) {
        return pisteService.retrievePiste(numPiste);
    }

    @DeleteMapping("/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste) {
        pisteService.deletePiste(numPiste);
    }

}
