import java.util.Arrays;
import java.util.List;

import Utiles.Escritura;
import Utiles.JsonReader;
import Utiles.Pokedex;
import Utiles.Pokemon;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Pokedex pokedex = JsonReader.LeerListPokemon("src/Recursos/pokemon.json");

        List<Pokemon> pokemonsCinco = pokedex.CincoUltimos();

        String cincoPokemons = "";

        for (Pokemon pokemon : pokemonsCinco) {
            
            cincoPokemons += pokemon + "";

        }

        Escritura.escribir("----- Los 5 ultimos pokemons según el listado -----");
        Escritura.escribir(cincoPokemons);

        ////////////

        String datosPikachu = "" + pokedex.BuscarPokemon("Pikachu");

        Escritura.escribir("----- Datos de Pikachu -----");
        Escritura.escribir(datosPikachu + "\n");

        ////////////

        Pokemon buscarPokemon = pokedex.BuscarPokemon("Charmander");

        Escritura.escribir("----- Evolucion Charmander -----");
        Escritura.escribir(Arrays.toString(buscarPokemon.getNext_evolution()) + "\n");

        ////////////

        List<Pokemon> pokemonTipo = pokedex.BuscarTipos("Fire");

        String buscarTipos = "";

        for (Pokemon pokemon : pokemonTipo) {
            
            buscarTipos += pokemon;

        }

        Escritura.escribir("----- Pokemons de tipo fire -----");
        Escritura.escribir(buscarTipos + "\n");

        ////////////

        List<Pokemon> pokemonDebilidad = pokedex.BuscarDebilidad("water", "Electric");

        String buscarDebilidad = "";

        for (Pokemon pokemon : pokemonDebilidad) {

            buscarDebilidad += pokemon;
            
        }

        Escritura.escribir("----- Pokemons con debilidad water o electric -----");
        Escritura.escribir(buscarDebilidad + "\n");

        ////////////

        Escritura.escribir("----- Pokemon con mas debilidades -----");
        Escritura.escribir(pokedex.MasDebilidad() + "\n");

        ////////////

        Escritura.escribir("----- Pokemon más alto -----");
        Escritura.escribir(pokedex.MasAto() + "\n");

    }

}
