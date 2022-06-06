package com.ifce.br.simpsoncrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.simpsoncrud.model.Person;

@Repository
public interface SimpsonRepository extends JpaRepository<Person, Long>{}