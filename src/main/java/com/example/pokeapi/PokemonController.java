package com.example.pokeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @PostMapping("/pokemon") // créer un pokémon
    public Pokemon createPokemon(@RequestBody Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    @GetMapping("/pokemons") // renvoie la liste de tous les pokemons
    public List<Pokemon> index(){
        return pokemonRepository.findAll();
    }

    @GetMapping("/pokemon/{name}") // trouver un pokemon par son nom
    public Pokemon show(@PathVariable String name){
        return pokemonRepository.findByName(name);
    }

    @PutMapping("/pokemon/{id}") // modifier un pokemon
    public Pokemon update(@PathVariable Long id,@RequestBody Pokemon pokemon){

        Pokemon updatedPokemon = pokemonRepository.findById(id).get();
        updatedPokemon.setName(pokemon.getName());
//        updatedPokemon.setTypeOfPokemon(pokemon.getTypeOfPokemon());
        return pokemonRepository.save(updatedPokemon);

//        Pokemon updatedPokemon = pokemonRepository.findById(id).orElse(null);
//        updatedPokemon.setName(Pokemon.getName());
//        return pokemonRepository.save(updatedPokemon);

    }
    @DeleteMapping("/pokemon/{id}") // supprimer un pokemon
    public boolean delete(@PathVariable Long id){
        pokemonRepository.deleteById(id);
        return true;
    }



}
