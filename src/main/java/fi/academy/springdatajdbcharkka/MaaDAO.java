package fi.academy.springdatajdbcharkka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
@Repository
public class MaaDAO {
    private Logger loki = Logger.getLogger(getClass().getName());
    private List<Maa> maat;


    public MaaDAO() {
        this.maat = new ArrayList<>();
    }

    public List<String> getMaat() {
        List<String> maat = jdbcPohja.queryForList(
                "SELECT name FROM country ORDER BY name",
                String.class);

        return maat;
    }

    public List<Maa> haeMaatTietokannasta() {
        loki.info("Täällä ollaan");
        List<Maa> maat = jdbcPohja.query("SELECT country.name, city.name as capital, country.continent, country.region, country.population FROM city JOIN country ON city.id = country.capital ORDER BY country.name;", (tulosjoukko, indeksi) -> {
                    Maa maa = new Maa(
                            tulosjoukko.getString("name"),
                            tulosjoukko.getString("capital"),
                            tulosjoukko.getString("continent"),
                            tulosjoukko.getString("region"),
                            tulosjoukko.getInt("population"));
                    return maa;
                }
        );

        return maat;
    }

    public int lisaaMaa(Maa maa) {
        return jdbcPohja.update("INSERT INTO country (code, name, continent, region, surfacearea, population, localname, governmentform, code2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[] { maa.getCode(), maa.getName(), maa.getContinent(), maa.getRegion(), maa.getSurfacearea(), maa.getPopulation(), maa.getLocalname(), maa.getGovernmentform(), maa.getCode2() });
    }

        @Autowired
        JdbcTemplate jdbcPohja;

    }


