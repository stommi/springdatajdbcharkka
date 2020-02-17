package fi.academy.springdatajdbcharkka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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



    @Autowired MaaDAO dao;







//    @RequestMapping(value = "/maat", method = RequestMethod.GET)
//    public List<String> restMetodiGetmaat() {
//        return maaDAO.getMaat();
//    }





}