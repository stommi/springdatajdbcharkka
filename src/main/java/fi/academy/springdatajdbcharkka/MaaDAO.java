package fi.academy.springdatajdbcharkka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class MaaDAO {
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
        List<Maa> maat = jdbcPohja.query("select name, continent, region, population from country", (tulosjoukko, indeksi) -> {
                    Maa maa = new Maa(
                            tulosjoukko.getString("name"),
                            tulosjoukko.getString("continent"),
                            tulosjoukko.getString("region"),
                            tulosjoukko.getInt("population"));
                    return maa;
                }
        );

        return maat;
    }


        @Autowired
        JdbcTemplate jdbcPohja;

    }


