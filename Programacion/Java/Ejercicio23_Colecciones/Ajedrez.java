package Programacion.Java.Ejercicio23_Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Ajedrez {

    public static void main(String[] args) {

        // Definimos los valores de cada pieza en peones
        HashMap<String, Integer> valores = new HashMap<>();

        valores.put("Dama", 9);
        valores.put("Torre", 5);
        valores.put("Alfil", 3);
        valores.put("Caballo", 2);
        valores.put("Peon", 1);
        
        // Generamos un número aleatorio de capturas entre 0 y 15
        Random random = new Random();
        int numCapturas = random.nextInt(16);
        
        // Definimos las piezas que puede capturar el jugador
        ArrayList<String> piezas = new ArrayList<>(Arrays.asList("Dama", "Torre", "Torre", "Alfil", "Alfil", "Caballo", "Caballo", "Peon", "Peon", "Peon", "Peon", "Peon", "Peon", "Peon", "Peon", "Peon"));
        
        // Capturamos las piezas aleatoriamente y sumamos su valor en peones
        int puntuacionTotal = 0;

        ArrayList<String> capturas = new ArrayList<>();

        for (int i = 0; i < numCapturas; i++) {
            int indice = random.nextInt(piezas.size());
            String pieza = piezas.get(indice);
            puntuacionTotal += valores.get(pieza);
            capturas.add(pieza);

            // Eliminamos la pieza capturada del array para que no se pueda capturar de nuevo
            piezas.remove(indice);
        }
        
        // Mostramos las capturas y la puntuación total
        System.out.println("\nFichas capturadas por el jugador:\n");

        for (String captura : capturas) {
            System.out.println(captura + " (" + valores.get(captura) + " peones)");
        }
        System.out.println("\nPuntos totales: " + puntuacionTotal + " peones.\n");
    }
}
