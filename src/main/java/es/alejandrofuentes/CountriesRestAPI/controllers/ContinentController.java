package es.alejandrofuentes.CountriesRestAPI.controllers;

import es.alejandrofuentes.CountriesRestAPI.models.ContinentModel;
import es.alejandrofuentes.CountriesRestAPI.services.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/continent")
public class ContinentController {
    @Autowired
    ContinentService continentService;

    @GetMapping()
    public ArrayList<ContinentModel> getContinents(){
        return this.continentService.getContinents();
    }
    @PostMapping()
    public ContinentModel saveContinent(@RequestBody ContinentModel continent){
        return this.continentService.saveContinent(continent);
    }
    @PutMapping()
    public ContinentModel updateContinent(@RequestBody ContinentModel continent){
        return this.continentService.updateContinent(continent);
    }
    @DeleteMapping("/{id}")
    public String deleteContinent(@PathVariable("id") Long id){
        return this.continentService.deleteContinent(id);
    }
}
