package fi.academy.springdatajdbcharkka;

public class Maa {
    private String name;
    private String capital;
    private String continent;
    private String region;
    private int population;
    private String code;
    private int surfacearea;
    private String localname;
    private String governmentform;
    private String code2;


    public Maa(String name, String capital, String continent, String region, int population) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.region = region;
        this.population = population;
    }

    public Maa(String name, String continent, String region, int population, String code, int surfacearea, String localname, String governmentform, String code2) {
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.population = population;
        this.code = code;
        this.surfacearea = surfacearea;
        this.localname = localname;
        this.governmentform = governmentform;
        this.code2 = code2;
    }

    public Maa(String name, String continent, String region, int population) {
        this.name = name;
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(int surfacearea) {
        this.surfacearea = surfacearea;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
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


    @Override
    public String toString() {
        return "Maa{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                '}';
    }
}
