package br.edu.ifes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class EsqueciSenhaController {

    @RequestMapping(value = "esqueci-senha", method = RequestMethod.GET)
    public ModelAndView load() {
        ModelAndView mav = new ModelAndView("esqueci-senha");
        return mav;
    }
}
