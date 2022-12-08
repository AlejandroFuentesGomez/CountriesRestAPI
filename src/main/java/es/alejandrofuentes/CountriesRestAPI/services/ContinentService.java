package es.alejandrofuentes.CountriesRestAPI.services;

import es.alejandrofuentes.CountriesRestAPI.models.ContinentModel;
import es.alejandrofuentes.CountriesRestAPI.repositories.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ContinentService {

    @Autowired
    ContinentRepository continentRepository;

    public ArrayList<ContinentModel> getContinents(){
        return (ArrayList<ContinentModel>) this.continentRepository.findAll();
    }

    public ContinentModel getContinentById(int id){
        return this.continentRepository.findById(new Long(id)).orElse(this.getContinents().get(0));
    }

    public ContinentModel saveContinent(ContinentModel continentModel){
        return this.continentRepository.save(continentModel);
    }

    public ContinentModel updateContinent(ContinentModel continent){
        return this.continentRepository.save(continent);
    }
    public String deleteContinent(Long id){
        try{
            this.continentRepository.deleteById(id);
            return "Delete successful";
        }
        catch (Error e){
            return "Error";
        }

    }
}
