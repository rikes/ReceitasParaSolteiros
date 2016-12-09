package br.edu.ifes.controller;

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
        ModelAndView mav = new ModelAndView("inicio");
        return mav;
    }

    @RequestMapping(value = "inicio", method = RequestMethod.GET)
    public ModelAndView load() {
        ModelAndView mav = new ModelAndView("inicio");
        return mav;
    }
}
