package es.alejandrofuentes.CountriesRestAPI.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Continent")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "continent")
    private List<Country> countryList;

    public Continent(Long id, String name, List<Country> countryList) {
        this.id = id;
        this.name = name;
        this.countryList = countryList;
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

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}
