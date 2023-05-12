package Java.EquipoFutbol;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Jugador> plantilla = new HashMap<Integer, Jugador>();
        
        // Alta jugadores
        EquipoFutbol.altaJugador(plantilla, 1);
        EquipoFutbol.altaJugador(plantilla, 2);
        EquipoFutbol.altaJugador(plantilla, 3);
        EquipoFutbol.altaJugador(plantilla, 4);
        EquipoFutbol.altaJugador(plantilla, 5);
        EquipoFutbol.altaJugador(plantilla, 6);

        // crea un objeto Integer a partir de un valor int
        int dorsal = 5;

        // llama al método altaJugador con el objeto Integer como segundo argumento
        EquipoFutbol.altaJugador(plantilla, dorsal);

        // Mostrar jugadores
        System.out.println("Plantilla completa:");
        EquipoFutbol.mostrar(plantilla);

        Jugador jugador = new Jugador();
        EquipoFutbol.altaJugador(jugador, dorsal);


        // Mostrar jugadores por posición
        System.out.println("\nDefensas:");
        EquipoFutbol.mostrar(plantilla, Posicion.DEFENSA);

        System.out.println("\nCentrocampistas:");
        EquipoFutbol.mostrar(plantilla, Posicion.CENTROCAMPISTA);

        System.out.println("\nDelanteros:");
        EquipoFutbol.mostrar(plantilla, Posicion.DELANTERO);

        System.out.println("\nPorteros:");
        EquipoFutbol.mostrar(plantilla, Posicion.PORTERO);

        // Editar jugador
        EquipoFutbol.editarJugador(plantilla, 1);

        // Mostrar jugadores actualizados
        System.out.println("\nPlantilla actualizada:");
        EquipoFutbol.mostrar(plantilla);

        // Eliminar jugador
        EquipoFutbol.eliminarJugador(plantilla, 6);

        // Mostrar jugadores actualizados
        System.out.println("\nPlantilla actualizada:");
        EquipoFutbol.mostrar(plantilla);
    }
}
