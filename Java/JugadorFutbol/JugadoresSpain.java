package Java.JugadorFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JugadoresSpain {

    private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public void add(Jugador jugador) {
        jugadores.add(jugador);
    }

    public static ArrayList<Jugador>getJugadores() {
        return jugadores;
    }
    
    public void ordenarPorLicencia() {
        Collections.sort(jugadores);
        System.out.println("\nJugadores ordenados por número de licencia:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public void ordenarPorGoles() {
        Comparator<Jugador> comparador = Comparator.comparing(Jugador::getNumeroGoles).reversed()
                .thenComparing(Jugador::getNombreCompleto);
        Collections.sort(jugadores, comparador);
        System.out.println("\nJugadores ordenados por número de goles:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public void ordenarPorFaltas() {
        Comparator<Jugador> comparador = Comparator.comparing(Jugador::getNumeroFaltas).reversed()
                .thenComparing(Jugador::getNombreCompleto);
        Collections.sort(jugadores, comparador);
        System.out.println("\nJugadores ordenados por número de faltas:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
    public static void main(String[] args) {

        JugadoresSpain jugadoresSpain = new JugadoresSpain();

        // Agregar jugadores
        jugadoresSpain.add(new Jugador("Juan García", "Grande", 1000));
        jugadoresSpain.add(new Jugador("Pedro Fernández", "Pulga", 1001));
        jugadoresSpain.add(new Jugador("María Martínez", "Raton", 1002));
        jugadoresSpain.add(new Jugador("Ana González", "Mago", 1003));
        jugadoresSpain.add(new Jugador("Luis Pérez", "La roca", 1004));

        // Ordenar por número de licencia
        jugadoresSpain.ordenarPorLicencia();

        // Ordenar por número de goles
        jugadoresSpain.ordenarPorGoles();

        // Ordenar por número de faltas
        jugadoresSpain.ordenarPorFaltas();

        Jugador jugadorAleatorio = UtilesJugadores.GeneraJugadorAleatorio();
        System.out.println("\nJugador aleatorio generado: " + jugadorAleatorio);

    }

}
