package es.alejandrofuentes.CountriesRestAPI.repositories;

import es.alejandrofuentes.CountriesRestAPI.models.ContinentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends CrudRepository<ContinentModel, Long> {
}
