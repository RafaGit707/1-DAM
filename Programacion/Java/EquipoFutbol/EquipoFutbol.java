package Java.EquipoFutbol;

import java.util.HashMap;
import java.util.Map;

public class EquipoFutbol {

    private String nombreEquipo;
    private Map<Integer, Jugador> plantilla;

    public EquipoFutbol(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        plantilla = new HashMap<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Map<Integer, Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Map<Integer, Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public void altaJugador(Integer dorsal) {
        Jugador jugador = new Jugador();
        jugador.introducirDatos();
        plantilla.put(dorsal, jugador);
    }

    public void altaJugador(Integer dorsal, Jugador jugador) {
        plantilla.put(dorsal, jugador);
    }

    public Jugador eliminarJugador(Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    public void mostrar() {
        System.out.println("Plantilla del equipo " + nombreEquipo + ":");
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println("Dorsal: " + entry.getKey() + ", Jugador: " + entry.getValue().getNombre());
        }
    }

    public void mostrar(String posicion) {
        System.out.println("Plantilla del equipo " + nombreEquipo + " en la posición de " + posicion + ":");
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            if (entry.getValue().getPosicion().equals(posicion)) {
                System.out.println("Dorsal: " + entry.getKey() + ", Jugador: " + entry.getValue().getNombre());
            }
        }
    }

    public boolean editarJugador(Integer dorsal) {
        Jugador jugador = plantilla.get(dorsal);
        if (jugador != null) {
            jugador.editarDatos();
            return true;
        } else {
            return false;
        }
    }
}


