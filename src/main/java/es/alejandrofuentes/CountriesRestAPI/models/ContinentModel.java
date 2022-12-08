package es.alejandrofuentes.CountriesRestAPI.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name="continents")
public class ContinentModel {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(
            name = "id",
            strategy = "es.alejandrofuentes.CountriesRestAPI.generators.IdGenerator"
    )
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "continent", cascade = CascadeType.ALL)
    private List<CountryModel> countryList;

    public ContinentModel(Long id, String name, List<CountryModel> countryList) {
        this.id = id;
        this.name = name;
        this.countryList = countryList;
    }

    public ContinentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CountryModel> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<CountryModel> countryList) {
        this.countryList = countryList;
    }
}
