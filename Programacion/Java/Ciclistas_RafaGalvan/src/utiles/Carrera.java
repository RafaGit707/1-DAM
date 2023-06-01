package utiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Carrera {
    List<String> equipos;
    List<Corredor> ciclistas;
    String nombre;

    Carrera(List<Ciclista> ciclistas, String nombre) {
        this.equipos = new ArrayList<>();
        this.ciclistas = new ArrayList<>();
        this.nombre = nombre;

        int dorsal = 1;
        for (Ciclista c : ciclistas) {
            Corredor corredor = new Corredor(c, dorsal);
            this.ciclistas.add(corredor);
            dorsal++;
        }
    }

    void insertarTiemposEtapa(Map<Integer, Integer> tiempos) {
        for (Map.Entry<Integer, Integer> entry : tiempos.entrySet()) {
            int dorsal = entry.getKey();
            int tiempo = entry.getValue();
            Corredor corredor = buscarCorredorPorDorsal(dorsal);
            if (corredor != null) {
                corredor.tiempo = tiempo;
            }
        }
    }

    void ordenarCorredoresPorTiempo() {
        ciclistas.sort((c1, c2) -> c1.tiempo - c2.tiempo);
    }

    Corredor buscarCorredorPorDorsal(int dorsal) {
        for (Corredor corredor : ciclistas) {
            if (corredor.dorsal == dorsal) {
                return corredor;
            }
        }
        return null;
    }

    int posicionCorredor(Corredor c) {
        return ciclistas.indexOf(c) + 1;
    }

    String clasificacionCompleta() {
        StringBuilder sb = new StringBuilder();
        for (Corredor corredor : ciclistas) {
            sb.append(corredor.dorsal)
              .append(" - ")
              .append(corredor.nombre)
              .append(" (")
              .append(corredor.equipo)
              .append(") : ")
              .append(corredor.tiempo)
              .append("\n");
        }
        return sb.toString();
    }

    String clasificacionPorEquipos() {
        Map<String, Integer> tiemposEquipos = new HashMap<>();
        Map<String, Integer> corredoresPorEquipo = new HashMap<>();

        for (Corredor corredor : ciclistas) {
            String equipo = corredor.equipo;
            int tiempo = corredor.tiempo;

            if (!tiemposEquipos.containsKey(equipo)) {
                tiemposEquipos.put(equipo, tiempo);
                corredoresPorEquipo.put(equipo, 1);
            } else {
                tiemposEquipos.put(equipo, tiemposEquipos.get(equipo) + tiempo);
                corredoresPorEquipo.put(equipo, corredoresPorEquipo.get(equipo) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String equipo : tiemposEquipos.keySet()) {
            sb.append(equipo)
              .append(": ")
              .append(tiemposEquipos.get(equipo))
              .append(" (")
              .append(corredoresPorEquipo.get(equipo))
              .append(" corredores)\n");
        }
        return sb.toString();
    }

    String podium() {
        ordenarCorredoresPorTiempo();

        StringBuilder sb = new StringBuilder("=========== PODIUM ===============\n");
        sb.append("Puesto 1: ")
          .append(ciclistas.get(0).dorsal)
          .append(" - ")
          .append(ciclistas.get(0).nombre)
          .append("(")
          .append(ciclistas.get(0).equipo)
          .append(") : ")
          .append(ciclistas.get(0).tiempo)
          .append("\n");
        sb.append("Puesto 2: ")
          .append(ciclistas.get(1).dorsal)
          .append(" - ")
          .append(ciclistas.get(1).nombre)
          .append("(")
          .append(ciclistas.get(1).equipo)
          .append(") : ")
          .append(ciclistas.get(1).tiempo)
          .append("\n");
        sb.append("Puesto 3: ")
          .append(ciclistas.get(2).dorsal)
          .append(" - ")
          .append(ciclistas.get(2).nombre)
          .append("(")
          .append(ciclistas.get(2).equipo)
          .append(") : ")
          .append(ciclistas.get(2).tiempo)
          .append("\n");
        return sb.toString();
    }
}