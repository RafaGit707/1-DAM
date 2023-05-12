package Java.EquipoFutbol;

import java.util.HashMap;
import java.util.Map;

public class EquipoFutbol {

    private static String nombreEquipo;
    private static Map<Integer, Jugador> plantilla;

    public EquipoFutbol(String nombreEquipo) {
        EquipoFutbol.nombreEquipo = nombreEquipo;
        plantilla = new HashMap<>();
    }    

    public EquipoFutbol () {

    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        EquipoFutbol.nombreEquipo = nombreEquipo;
    }

    public Map<Integer, Jugador> getPlantilla() {
        return plantilla;
    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, int dorsal) {
        Jugador jugador = new Jugador();
        jugador.introducirDatos();
        plantilla.put(dorsal, jugador);
    }

    public static void altaJugador(Jugador jugador, int dorsal) {
        plantilla.put(dorsal, jugador);
    }

    public static void eliminarJugador(Map<Integer, Jugador> plantilla, int dorsal) {
        if (plantilla.containsKey(dorsal)) {
            plantilla.remove(dorsal);
            System.out.println("El jugador con dorsal " + dorsal + " ha sido eliminado.");
        } else {
            System.out.println("No se ha encontrado un jugador con el dorsal " + dorsal + ".");
        }
    }
    

    public static void mostrar(Map<Integer, Jugador>plantilla) {
        System.out.println("Plantilla del equipo " + EquipoFutbol.nombreEquipo + ":");
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println("Dorsal: " + entry.getKey() + ", Jugador: " + entry.getValue().getNombre());
        }
    }

    public static void mostrar(Map<Integer, Jugador> plantilla, Posicion posicion) {
        System.out.println("Jugadores en la posición de " + posicion + ":");
        for (Jugador jugador : plantilla.values()) {
            if (jugador.getPosicion().equals(posicion)) {
                System.out.println(jugador.toString());
            }
        }
    }
    

    public static void editarJugador(Map<Integer, Jugador> plantilla, int dorsal) {
        if (plantilla.containsKey(dorsal)) {
            Jugador jugador = plantilla.get(dorsal);
            jugador.editarDatos();
            System.out.println("Jugador actualizado:");
            System.out.println(jugador);
        } else {
            System.out.println("No se ha encontrado un jugador con el dorsal " + dorsal);
        }
    }
    
}


