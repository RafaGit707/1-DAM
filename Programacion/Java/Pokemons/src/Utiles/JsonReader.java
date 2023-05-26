package Utiles;

import java.io.File;
import java.io.IOException;

public class JsonReader {

    public static Pokedex LeerListPokemon(String relativePathFile) {

		Pokedex pokedex = null;

		try {

			File ficheroPokemon = new File(relativePathFile);

			ObjectMapper objectMapper = new ObjectMapper();

            pokedex = objectMapper.readValue(ficheroPokemon, Pokedex.class);

        } catch (IOException e) {
            
            e.printStackTrace();

        }

		return pokedex;
		
	}
    
}
