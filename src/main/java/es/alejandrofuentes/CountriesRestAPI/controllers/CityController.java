package es.alejandrofuentes.CountriesRestAPI.controllers;

import es.alejandrofuentes.CountriesRestAPI.models.CityModel;
import es.alejandrofuentes.CountriesRestAPI.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping()
    public ArrayList<CityModel> getCities(){
    return this.cityService.getCities();
    }
    @PostMapping
    public CityModel saveCity(@RequestBody CityModel city){
        return this.cityService.saveCity(city);
    }
}
