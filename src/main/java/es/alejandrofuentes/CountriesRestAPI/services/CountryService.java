package es.alejandrofuentes.CountriesRestAPI.services;

import es.alejandrofuentes.CountriesRestAPI.models.CountryModel;
import es.alejandrofuentes.CountriesRestAPI.repositories.CountryRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public ArrayList<CountryModel> getCountries(){
        return (ArrayList<CountryModel>) this.countryRepository.findAll();
    }
    public CountryModel saveCountry(CountryModel country){
        return this.countryRepository.save(country);
    }
}
