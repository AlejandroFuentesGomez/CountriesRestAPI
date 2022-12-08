package es.alejandrofuentes.CountriesRestAPI.controllers;

import es.alejandrofuentes.CountriesRestAPI.models.ContinentModel;
import es.alejandrofuentes.CountriesRestAPI.models.CountryModel;
import es.alejandrofuentes.CountriesRestAPI.models.CountryRequestBodyModel;
import es.alejandrofuentes.CountriesRestAPI.services.ContinentService;
import es.alejandrofuentes.CountriesRestAPI.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService countryService;
    @Autowired
    ContinentService continentService;
    @GetMapping()
    public ArrayList<CountryModel> getCountries(){
        return this.countryService.getCountries();
    }
    @PostMapping()
    public <T> Object saveCountry(@RequestBody CountryRequestBodyModel countryRequestBodyModel){
        try {
            final ContinentModel continent = continentService.getContinentById(countryRequestBodyModel.getContinent());
            final CountryModel countryModel = new CountryModel(countryRequestBodyModel, continent);
            return  countryService.saveCountry(countryModel);
        }
        catch (Error e){
            return "bad";
        }
    }
}
