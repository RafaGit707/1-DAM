package Programacion.Java.pokemon_RafaGalvan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Pokedex
        Pokedex pokedex = new Pokedex("pokemon.json");

        // Obtener los 5 últimos pokemons
        List<Pokemon> lastFive = pokedex.getUltimosPokemon();

        // Obtener datos de Pikachu
        Pokemon pikachu = pokedex.getPokemonByName("Pikachu");

        // Obtener evolución de Charmander
        List<String> charmanderEvolutions = pokedex.getPokemonEvolutions("Charmander");

        // Obtener pokemons de tipo fire
        List<Pokemon> firePokemons = pokedex.getPokemonByType("fire");

        // Obtener pokemons con debilidad water o electric
        List<Pokemon> weakPokemons = pokedex.getPokemonPorDebilidades("electric");

        // Obtener pokemon con más debilidades
        Pokemon mostWeaknessesPokemon = pokedex.getPokemonConMasDebilidades();

        // Obtener pokemon más alto
        Pokemon tallestPokemon = pokedex.getPokemonMasAlto();

        // Guardar información en un archivo
        try {
            FileWriter writer = new FileWriter("consultasPokemon.txt");
            writer.write("Últimos 5 pokemons:\n");
            for (Pokemon pokemon : lastFive) {
                writer.write(pokemon.getName() + "\n");
            }
            writer.write("\nDatos de Pikachu:\n");
            writer.write(pikachu.toString() + "\n");
            writer.write("\nEvolución de Charmander:\n");
            for (String evolution : charmanderEvolutions) {
                writer.write(evolution + "\n");
            }
            writer.write("\nPokemons de tipo fire:\n");
            for (Pokemon pokemon : firePokemons) {
                writer.write(pokemon.getName() + "\n");
            }
            writer.write("\nPokemons con debilidad water o electric:\n");
            for (Pokemon pokemon : weakPokemons) {
                writer.write(pokemon.getName() + "\n");
            }
            writer.write("\nPokemon con más debilidades:\n");
            writer.write(mostWeaknessesPokemon.getName() + "\n");
            writer.write("\nPokemon más alto:\n");
            writer.write(tallestPokemon.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }
}
