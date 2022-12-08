package es.alejandrofuentes.CountriesRestAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "cities")
public class CityModel {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(
            name = "id",
            strategy = "es.alejandrofuentes.CountriesRestAPI.generators.IdGenerator"
    )
    private Long id;
    private String name;

    private String photo;
    @ManyToOne(optional = false)
    @JoinColumn(name = "countries_id", referencedColumnName = "id")
    @JsonIgnore()
    private CountryModel country;

    public CityModel(Long id, String name, String photo, CountryModel country) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.country = country;
    }

    public CityModel() {

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public CountryModel getCountry() {
        return country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }
}
