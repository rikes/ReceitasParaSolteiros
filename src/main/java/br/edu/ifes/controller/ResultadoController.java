package br.edu.ifes.controller;

import br.edu.ifes.model.Ingrediente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class ResultadoController {
    @RequestMapping(value = "resultado", method = RequestMethod.GET)
    public ModelAndView pesquisa(Ingrediente ingrediente) {
        String[] ing =  ingrediente.getValor().split(";");
        ModelAndView mav = new ModelAndView("resultado" );
        return mav;
    }

}
