package Java.JugadorFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JugadoresSpain {

    private List<Jugador> jugadores;

    public JugadoresSpain() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarJugadoresOrdenadosPorNumeroDeLicencia() {
        System.out.println("Jugadores ordenados por número de licencia:");
        Collections.sort(jugadores);
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public void mostrarJugadoresOrdenadosPorNumeroDeGoles() {
        System.out.println("Jugadores ordenados por número de goles:");
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                if (j1.getNumeroGoles() == j2.getNumeroGoles()) {
                    return j1.getApodo().compareTo(j2.getApodo());
                }
                return j2.getNumeroGoles() - j1.getNumeroGoles();
            }
        });
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public void mostrarJugadoresOrdenadosPorNumeroDeFaltas() {
        System.out.println("Jugadores ordenados por número de faltas:");
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                if (j1.getNumeroFaltas() == j2.getNumeroFaltas()) {
                    return j1.getApodo().compareTo(j2.getApodo());
                }
                return j2.getNumeroFaltas() - j1.getNumeroFaltas();
            }
        });
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}
