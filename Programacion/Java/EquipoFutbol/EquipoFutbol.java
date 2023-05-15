package Java.EquipoFutbol;

import java.util.Map;
import java.util.Scanner;

public class EquipoFutbol {

    static Scanner sc = new Scanner(System.in);

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Posicion (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO): ");
        Posicion posicion = Posicion.valueOf(sc.nextLine().toUpperCase());
        System.out.print("Estatura: ");
        double estatura = Double.parseDouble(sc.nextLine());
        Jugador jugador = new Jugador(dni, nombre, posicion, estatura);
        altaJugador(plantilla, dorsal, jugador);
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (!plantilla.containsKey(dorsal)) {
            plantilla.put(dorsal, jugador);
            System.out.println("Jugador añadido correctamente.");
        } else {
            System.out.println("Error: el dorsal " + dorsal + " ya está en uso.");
        }
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (plantilla.containsKey(dorsal)) {
            Jugador jugadorEliminado = plantilla.remove(dorsal);
            System.out.println("Jugador eliminado correctamente: " + jugadorEliminado);
            return jugadorEliminado;
        } else {
            System.out.println("Error: el dorsal " + dorsal + " no existe en la plantilla.");
            return null;
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        System.out.println("Plantilla completa:");
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println("Dorsal " + entry.getKey() + ": " + entry.getValue().getNombre());
        }
    }
    public static void mostrar(Map<Integer, Jugador> plantilla, Posicion posicion) {
        System.out.println("Jugadores en " + posicion.toString() + ":");
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            if (entry.getValue().getPosicion() == posicion) {
                System.out.println(entry.getValue().getNombre() + " (" + entry.getKey() + ")");
            }
        }
    }

    public static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Jugador jugador = plantilla.get(dorsal);
        if (jugador != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del jugador:");
            jugador.setNombre(sc.nextLine());
            System.out.println("Introduce la posición del jugador (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO):");
            jugador.setPosicion(Posicion.valueOf(sc.nextLine().toUpperCase()));
            System.out.println("Introduce la estatura del jugador:");
            jugador.setEstatura(sc.nextDouble());
            sc.nextLine(); // Consumir el salto de línea
            sc.close();
            return true;
        } else {
            System.out.println("El dorsal " + dorsal + " no existe en la plantilla.");
            return false;
        }
    }
    
}

