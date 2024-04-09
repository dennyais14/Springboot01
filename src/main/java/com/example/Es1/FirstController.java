//Scrivi una applicazione web Spring Boot
// che alla endpoint GET v1/ciao?nome=Giuseppe&regione=Lombardia risponde
// con "Ciao Giuseppe, com'è il tempo in Lombardia?"

package com.example.Es1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/v1")
public class FirstController {
    @RequestMapping(path="/ciao", method = RequestMethod.GET)
    public String ciao(@RequestParam(name="nome")String nome, @RequestParam(name="regione")String regione){
        return "Ciao "+nome+","+" com'è il tempo in "+regione;
    }
}
