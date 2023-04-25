package Java.Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FactoriaPersonas {

    private static final String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
    private static final String[] nombres = {"Neo", "Trinity", "Morpheus", "Agent Smith"};

    public static List<Personaje> crearPersonas(int cantidad) {
        Random random = new Random();
        List<Personaje> personas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            int id = i + 1;
            String nombre = nombres[random.nextInt(nombres.length)];
            String ciudadNacimiento = ciudades[random.nextInt(ciudades.length)];
            String fechaCreacion = "";
            int edad = random.nextInt(81);
            int probabilidadMorir = random.nextInt() * 100;

            if (nombre.equals("Agent Smith")) {
                int capacidadInfeccion = random.nextInt(1001);
                personas.add(new Smith(id, nombre, ciudadNacimiento, fechaCreacion, edad, probabilidadMorir, capacidadInfeccion));
            } else {
                personas.add(new PersonaGenerica(id, nombre, ciudadNacimiento, edad, probabilidadMorir));
            }
        }

        Collections.shuffle(personas);
        return personas;
    }
}

