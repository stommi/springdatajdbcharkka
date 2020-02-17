package fi.academy.springdatajdbcharkka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaaController {

    @GetMapping ("/api/maat")
        public List<String> restMetodiGetmaat() {
        return dao.getMaat();
    }

    @GetMapping("api/maaoliot")
    public List<Maa> restMetodiGetOliot() {
        return dao.haeMaatTietokannasta();
    }

    @GetMapping("api/maahaku")
    public Maa restMetodiFind(@RequestParam(name="name", required = false) String hakusana) {
        List<Maa> lista = dao.haeMaatTietokannasta();
        for (Maa maa: lista) {
            if (maa.getName().equalsIgnoreCase(hakusana)) {
                return maa;
            }
        }
        return null;
    }

    @PostMapping("api/maatLisays")
    public void restMetodiPost(@RequestBody Maa maa) {
        dao.lisaaMaa(maa);
    }

    @Autowired MaaDAO dao;
}
