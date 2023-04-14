package com.example.pokeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

Pokemon findByName(String name);

}
