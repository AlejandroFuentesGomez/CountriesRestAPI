package es.alejandrofuentes.CountriesRestAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import es.alejandrofuentes.CountriesRestAPI.generators.IdGenerator;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;


@Entity
@Table(name = "countries")
public class CountryModel {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(
            name = "id",
            strategy = "es.alejandrofuentes.CountriesRestAPI.generators.IdGenerator"
    )
    private Long id;
    private String name;
    private String currency;
    private String language;
    private String photo;
    private Integer population;
    @ManyToOne(optional = false)
    @JoinColumn(name = "continents_id", referencedColumnName = "id")
    @JsonIgnore()
    private ContinentModel continent;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country", cascade = CascadeType.ALL)
    private List<CityModel> cityList;

    public CountryModel(Long id, String name, String currency, String language, String photo, Integer population, ContinentModel continent) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.language = language;
        this.photo = photo;
        this.population = population;
        this.continent = continent;
    }
    public CountryModel(CountryRequestBodyModel countryRequestBodyModel, ContinentModel continent){
        this.id = countryRequestBodyModel.getId();
        this.name = countryRequestBodyModel.getName();
        this.currency = countryRequestBodyModel.getCurrency();
        this.language = countryRequestBodyModel.getLanguage();
        this.photo = countryRequestBodyModel.getPhoto();
        this.population = countryRequestBodyModel.getPopulation();
        this.continent = continent;
    }
    public CountryModel() {

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

    public ContinentModel getContinent() {
        return continent;
    }

    public void setContinent(ContinentModel continent) {
        this.continent = continent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CityModel> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityModel> cityList) {
        this.cityList = cityList;
    }
}