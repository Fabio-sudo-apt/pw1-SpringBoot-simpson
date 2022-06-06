package com.ifce.br.simpsoncrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int idade;
    private String empresa;
    private String episodio;


    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public String getEmpresa() {
        return empresa;
    }

    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

}