package Java.JugadorFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JugadoresSpain {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        // Añadimos algunos jugadores
        jugadores.add(new Jugador("Juan García", "Grande", 1001));
        jugadores.add(new Jugador("Pedro Fernández", "Pulga", 1002));
        jugadores.add(new Jugador("María Martínez", "Raton", 1003));
        jugadores.add(new Jugador("Ana González", "Mago", 1004));
        jugadores.add(new Jugador("Luis Pérez", "La roca", 1005));
        
        // Mostramos la lista de jugadores ordenados por número de licencia
        System.out.println("Jugadores ordenados por número de licencia:");
        Collections.sort(jugadores);
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
        
        // Mostramos la lista de jugadores ordenados por número de goles
        System.out.println("\nJugadores ordenados por número de goles:");
        Comparator<Jugador> comparadorGoles = new ComparadorGoles();
        Collections.sort(jugadores, comparadorGoles);
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
        
        // Mostramos la lista de jugadores ordenados por número de faltas
        System.out.println("\nJugadores ordenados por número de faltas:");
        Comparator<Jugador> comparadorFaltas = new ComparadorFaltas();
        Collections.sort(jugadores, comparadorFaltas);
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
    
    // Comparador para ordenar los jugadores por número de goles
    static class ComparadorGoles implements Comparator<Jugador> {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            if (j1.getNumeroGoles() == j2.getNumeroGoles()) {
                return j1.getNombreCompleto().compareTo(j2.getNombreCompleto());
            }
            return j2.getNumeroGoles() - j1.getNumeroGoles();
        }
    }
    
    // Comparador para ordenar los jugadores por número de faltas
    static class ComparadorFaltas implements Comparator<Jugador> {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            if (j1.getNumeroFaltas() == j2.getNumeroFaltas()) {
                return j1.getNombreCompleto().compareTo(j2.getNombreCompleto());
            }
            return j2.getNumeroFaltas() - j1.getNumeroFaltas();
        }
    }
}
