package es.alejandrofuentes.CountriesRestAPI.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String currency;
    private String language;
    private String photo;
    private Integer population;
    @ManyToOne
    private Continent continent;
    @OneToMany(mappedBy = "country")
    private List<City> cityList;

    public Country(Long id, String name, String currency, String language, String photo, Integer population, Continent continent, List<City> cityList) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.language = language;
        this.photo = photo;
        this.population = population;
        this.continent = continent;
        this.cityList = cityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
