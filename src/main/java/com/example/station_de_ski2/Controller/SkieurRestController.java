package com.example.station_de_ski2.Controller;

import com.example.station_de_ski2.entities.Skieur;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/skieurs")
public class SkieurRestController {


    private SkieurRestController skieurService;

    @PostMapping("/add")
    public void add(@RequestBody Skieur skieur) {
        skieurService.add(skieur);
    }

    @PutMapping("/update")
    public Skieur update(@RequestBody Skieur skieur) {
        return skieurService.update(skieur);
    }

    @GetMapping("/all")
    public List<Skieur> getAll() {
        return skieurService.getAll();
    }

    @GetMapping("/{id}")
    public Skieur getById(@PathVariable long id) {
        return skieurService.getById(id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable long id) {
        skieurService.remove(id);
    }

}
