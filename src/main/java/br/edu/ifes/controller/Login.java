package br.edu.ifes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class Login{

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView cadastrar(){
        ModelAndView model = new ModelAndView("login.html");
      //  model.addObject("msg", "hello world");

        return model;
    }
}
