package com.example.pokeapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String typeOfPokemon;

    public Pokemon(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfPokemon() {
        return typeOfPokemon;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfPokemon(String typeOfPokemon) {
        this.typeOfPokemon = typeOfPokemon;
    }
}
