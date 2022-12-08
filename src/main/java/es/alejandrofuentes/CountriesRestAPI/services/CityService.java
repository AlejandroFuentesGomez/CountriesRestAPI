package es.alejandrofuentes.CountriesRestAPI.services;

import es.alejandrofuentes.CountriesRestAPI.models.CityModel;
import es.alejandrofuentes.CountriesRestAPI.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public ArrayList<CityModel> getCities(){
        return (ArrayList<CityModel>) cityRepository.findAll();
    }
    public CityModel saveCity(CityModel city){
        return cityRepository.save(city);
    }
}
