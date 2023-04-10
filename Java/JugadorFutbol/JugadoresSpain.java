package Java.JugadorFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JugadoresSpain {

    private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public void add(Jugador jugador) {
        jugadores.add(jugador);
    }

    public static ArrayList<Jugador>getJugadores() {
        return jugadores;
    }
    
    private static void ordenarPorLicencia() {
        Collections.sort(jugadores);
    }

    private static void ordenarPorGoles() {
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador jugador1, Jugador jugador2) {
                if (jugador1.getNumeroGoles() == jugador2.getNumeroGoles()) {
                    return jugador1.getNombreCompleto().compareTo(jugador2.getNombreCompleto());
                } else {
                    return jugador2.getNumeroGoles() - jugador1.getNumeroGoles();
                }
            }
        });
    }

    private static void ordenarPorFaltas() {
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador jugador1, Jugador jugador2) {
                if (jugador1.getNumeroFaltas() == jugador2.getNumeroFaltas()) {
                    return jugador1.getNombreCompleto().compareTo(jugador2.getNombreCompleto());
                } else {
                    return jugador1.getNumeroFaltas() - jugador2.getNumeroFaltas();
                }
            }
        });
    }

    private static void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }
    public static void main(String[] args) {

        jugadores.add(new Jugador("Juan García", "La Roca de Oro", 1000, 5, 3));
        jugadores.add(new Jugador("Pedro Fernández", "El Pulga de Titanio", 1001, 7, 2));
        jugadores.add(new Jugador("María Martínez", "La Jardinera de los mares", 1002, 2, 6));
        jugadores.add(new Jugador("Ana González", "La Muñeca loca", 1003, 1, 1));
        jugadores.add(new Jugador("Luis Pérez", "El Burro Blanco", 1004, 3, 4));

        System.out.println("Jugadores ordenados por número de licencia:");
        ordenarPorLicencia();
        mostrarJugadores();

        System.out.println("\nJugadores ordenados por número de goles:");
        ordenarPorGoles();
        mostrarJugadores();

        System.out.println("\nJugadores ordenados por número de faltas:");
        ordenarPorFaltas();
        mostrarJugadores();

        Jugador jugadorAleatorio = UtilesJugadores.GeneraJugadorAleatorio();
        System.out.println("\nJugador aleatorio generado: " + jugadorAleatorio);

    }

}
