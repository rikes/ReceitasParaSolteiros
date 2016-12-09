package br.edu.ifes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class SobreNosController {
    @RequestMapping(value = "sobre-nos", method = RequestMethod.GET)
    public ModelAndView load() {
        ModelAndView mav = new ModelAndView("sobre-nos" );
        return mav;
    }
}
