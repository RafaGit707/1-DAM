package Utiles;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {

    private ArrayList<Pokemon> pokemon;


    public Pokedex() {

    }


    
    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }



    public List<Pokemon> CincoUltimos() {

        List<Pokemon> cincoUltimos = new ArrayList<>();

        int tamañoLista = this.pokemon.size();
        
        for (int i = tamañoLista - 5; i < tamañoLista; i++) {

            cincoUltimos.add(pokemon.get(i));
            
        }

        return cincoUltimos;

    }


    public Pokemon BuscarPokemon(String name) {

        Pokemon poke = null;

        for (int i = 0; i < pokemon.size(); i++) {

            if (pokemon.get(i).getName().equalsIgnoreCase(name)) {

                poke = pokemon.get(i);
                
            }
            
        }
        

        return poke;

    }


    public List<Pokemon> BuscarTipos(String type) {

        List<Pokemon> buscarTipo = new ArrayList<>();

        for (int i = 0; i < pokemon.size(); i++) {

            if (pokemon.get(i).getType().contains(type)) {

                buscarTipo.add(pokemon.get(i));
                
            }
            
        }

        return buscarTipo;

    }


    public List<Pokemon> BuscarDebilidad(String weaknesses, String weaknesses2) {

        List<Pokemon> buscarDebilidad = new ArrayList<>();

        for (int i = 0; i < pokemon.size(); i++) {

            if ((pokemon.get(i).getWeaknesses().contains(weaknesses)) || (pokemon.get(i).getWeaknesses().contains(weaknesses2))) {

                buscarDebilidad.add(pokemon.get(i));
                
            }
            
        }

        return buscarDebilidad;

    }


    public Pokemon MasDebilidad() {

        Pokemon pokemonConMasDebilidades = null;
        int numDebilidad = 0;

        for (Pokemon pokemon : pokemon) {

            int debilidad = pokemon.getWeaknesses().size();

            if (debilidad > numDebilidad) {

                pokemonConMasDebilidades = pokemon;
                numDebilidad = debilidad;

            }

        }

        return pokemonConMasDebilidades;

    }

    public Pokemon MasAto() {

        Pokemon pokemonMasAlto = null;
        double alturaMaxima = 0;

        for (Pokemon pokemon : pokemon) {

            String[] altura = pokemon.getHeight().split(" ");
            double altura2 = Double.parseDouble(altura[0]);

            if (altura2 > alturaMaxima) {

                pokemonMasAlto = pokemon;
                alturaMaxima = altura2;

            }
        }

        return pokemonMasAlto;

    }
    
}   