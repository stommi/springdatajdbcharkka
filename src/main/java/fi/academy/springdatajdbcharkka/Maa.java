package fi.academy.springdatajdbcharkka;

public class Maa {
    private String name;
    private String city;
    private String continent;
    private String region;
    private int population;

    public Maa(String name, String city, String continent, String region, int population) {
        this.name = name;
        this.city = city;
        this.continent = continent;
        this.region = region;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Maa{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                '}';
    }
}
