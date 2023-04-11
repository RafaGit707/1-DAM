package Programacion.Java.Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FactoriaPersonas {

    private static final String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
    private static final String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};

    public static List<Personaje> crearPersonas(int cantidad) {
        Random random = new Random();
        List<Personaje> personas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            int id = i + 1;
            String nombre = nombres[random.nextInt(nombres.length)];
            String ciudadNacimiento = ciudades[random.nextInt(ciudades.length)];
            int edad = random.nextInt(81);
            double probabilidadMorir = random.nextDouble() * 100;

            personas.add(new PersonaGenerica(id, nombre, ciudadNacimiento, edad, probabilidadMorir));
        }

        Collections.shuffle(personas);
        return personas;
    }
}
