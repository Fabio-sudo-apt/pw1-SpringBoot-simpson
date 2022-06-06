package com.ifce.br.simpsoncrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.simpsoncrud.model.Person;
import com.ifce.br.simpsoncrud.service.ServiceSimpson;

@Controller
public class SimpsonController {
    @Autowired
    private ServiceSimpson service;

    @GetMapping("/index")
    public ModelAndView homePage(Person person) {
        List<Person> personAll = service.listPerson();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("personSimpson", personAll);
        return mv;
    }

    @GetMapping("/person/cadastrar")
    public String cadastra() {
        return "fomulario";
    }

    @GetMapping("/person/salvar")
    public String salvar(Person person) {
        service.createPerson(person);
        return "redirect:/index";
    }

    @GetMapping("/person/excluir/{id}")
    public String delete(@PathVariable Long id){
        service.deletePerson(id);
        return "redirect:/index";
    }
}