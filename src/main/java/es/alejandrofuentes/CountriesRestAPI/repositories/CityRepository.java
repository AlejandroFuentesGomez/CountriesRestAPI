package es.alejandrofuentes.CountriesRestAPI.repositories;

import es.alejandrofuentes.CountriesRestAPI.models.CityModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<CityModel, Long> {
}
