package com.ifce.br.simpsoncrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.simpsoncrud.model.Person;
import com.ifce.br.simpsoncrud.repository.SimpsonRepository;

@Service
public class ServiceSimpson {
    @Autowired
    private SimpsonRepository repository;

    public void createPerson(Person person) {
        if (person != null) {
            repository.save(person);
        }
    }

    public List<Person> listPerson() {
        return repository.findAll();
    }

    public void deletePerson(Long id) {
        if (id != null) {
            repository.deleteById(id);
        }
    }
}