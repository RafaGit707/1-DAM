package Java.pokemon_RafaGalvan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokedex {

    private ArrayList<Pokemon> pokemonList;

    public Pokedex(ArrayList<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public Pokedex(String filename) {

    }    

    public ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(ArrayList<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public ArrayList<Pokemon> getUltimosPokemon() {
        ArrayList<Pokemon> latestPokemon = new ArrayList<>();
        int ultimosCinco = 5;
    
        if (pokemonList == null || pokemonList.size() <= ultimosCinco) {
            return pokemonList;
        }
    
        for (int i = pokemonList.size() - 1; i >= pokemonList.size() - ultimosCinco; i--) {
            latestPokemon.add(pokemonList.get(i));
        }
    
        Collections.reverse(latestPokemon);
        return latestPokemon;
    }
    

    public Pokemon getPokemonByName(String name) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getName().equalsIgnoreCase(name)) {
                return pokemon;
            }
        }
        return null;
    }

    public ArrayList<Pokemon> getPokemonByType(String type) {
        ArrayList<Pokemon> pokemonByType = new ArrayList<>();

        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getType().contains(type.toLowerCase())) {
                pokemonByType.add(pokemon);
            }
        }

        return pokemonByType;
    }

    public ArrayList<Pokemon> getPokemonPorDebilidades(String weakness) {
        ArrayList<Pokemon> pokemonPorDebilidades = new ArrayList<>();

        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getWeaknesses().contains(weakness.toLowerCase())) {
                pokemonPorDebilidades.add(pokemon);
            }
        }

        return pokemonPorDebilidades;
    }

    public Pokemon getPokemonConMasDebilidades() {
        Pokemon pokemonConMasDebilidades = null;
        int masDebilidades = 0;

        for (Pokemon pokemon : pokemonList) {
            int debilidadesSize = pokemon.getWeaknesses().size();

            if (debilidadesSize > masDebilidades) {
                pokemonConMasDebilidades = pokemon;
                masDebilidades = debilidadesSize;
            }
        }

        return pokemonConMasDebilidades;
    }

    public Pokemon getPokemonMasAlto() {
        Pokemon pokemonMasAlto = null;
        double maxHeight = 0;

        for (Pokemon pokemon : pokemonList) {
            double height = Double.parseDouble(pokemon.getHeight());

            if (height > maxHeight) {
                pokemonMasAlto = pokemon;
                maxHeight = height;
            }
        }

        return pokemonMasAlto;
    }
    
    public List<String> getPokemonEvolutions(String pokemonName) {
        List<String> evolutions = new ArrayList<>();
        Pokemon pokemon = null;
        for (Pokemon p : pokemonList) {
            if (p.getName().equalsIgnoreCase(pokemonName)) {
                pokemon = p;
                break;
            }
        }
        if (pokemon == null) {
            return evolutions; // No se encontró un Pokemon con ese nombre
        }
        return evolutions;
    }
    

}

