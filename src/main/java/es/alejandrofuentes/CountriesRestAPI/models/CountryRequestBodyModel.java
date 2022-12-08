package es.alejandrofuentes.CountriesRestAPI.models;
public class CountryRequestBodyModel {
    private Long id;
    private String name;
    private String currency;
    private String language;
    private String photo;
    private Integer population;
    private Integer continent;

    public CountryRequestBodyModel(Long id, String name, String currency, String language, String photo, Integer population, Integer continent) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.language = language;
        this.photo = photo;
        this.population = population;
        this.continent = continent;
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

    public Integer getContinent() {
        return continent;
    }

    public void setContinent(Integer continent) {
        this.continent = continent;
    }
}
