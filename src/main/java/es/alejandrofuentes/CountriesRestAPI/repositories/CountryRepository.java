package es.alejandrofuentes.CountriesRestAPI.repositories;

import es.alejandrofuentes.CountriesRestAPI.models.CountryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<CountryModel, Long> {

}
