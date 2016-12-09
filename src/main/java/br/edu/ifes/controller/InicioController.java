package br.edu.ifes.controller;

import br.edu.ifes.model.Ingrediente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class InicioController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView loadVazio() {
        return carregar();
    }

    @RequestMapping(value = "inicio", method = RequestMethod.GET)
    public ModelAndView load() {
        return carregar();
    }

    private ModelAndView carregar(){
        ModelAndView mav = new ModelAndView("inicio");
        Ingrediente ingrediente = new Ingrediente();
        mav.addObject("ingrediente", ingrediente);
        return mav;
    }
}