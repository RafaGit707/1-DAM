import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utiles.Ciclista;

public class Main {
    public static void main(String[] args) {
        // Cargar datos de los archivos CSV y JSON
        List<Ciclista> ciclistas = cargarCiclistasDeJson("ciclistas.json");
        String nombreCarrera = "Vuelta a Málaga";

        Carrera carrera = new Carrera(ciclistas, nombreCarrera);

        // Cargar los tiempos de las etapas desde los archivos etapax.json
        Map<Integer, Integer> tiemposEtapa1 = cargarTiemposEtapaDeJson("etapa1.json");
        Map<Integer, Integer> tiemposEtapa2 = cargarTiemposEtapaDeJson("etapa2.json");
        Map<Integer, Integer> tiemposEtapa3 = cargarTiemposEtapaDeJson("etapa3.json");

        // Insertar los tiempos de las etapas en la carrera
        carrera.insertarTiemposEtapa(tiemposEtapa1);
        carrera.insertarTiemposEtapa(tiemposEtapa2);
        carrera.insertarTiemposEtapa(tiemposEtapa3);

        // Obtener los resultados
        String clasificacionFinal = carrera.clasificacionCompleta();
        String podium = carrera.podium();
        String clasificacionEquipos = carrera.clasificacionPorEquipos();

        // Imprimir los resultados
        System.out.println("==== NOMBRE DE LA CARRERA ====");
        System.out.println(carrera.nombre);
        System.out.println("==== CICLISTAS PARTICIPANTES EN LA CARRERA ====");
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.nombre + " (" + ciclista.equipo + ")");
        }
        System.out.println("==== CLASIFICACIÓN FINAL ====");
        System.out.println(clasificacionFinal);
        System.out.println("==== PODIUM ====");
        System.out.println(podium);
        System.out.println("==== CLASIFICACIÓN POR EQUIPOS ====");
        System.out.println(clasificacionEquipos);
        System.out.println("==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ====");
        Corredor corredorBuscado = carrera.buscarCorredorPorDorsal(22);
        int posicionCorredor = carrera.posicionCorredor(corredorBuscado);
        System.out.println("Posición: " + posicionCorredor);
    }

    private static List<Ciclista> cargarCiclistasDeJson(String filename) {
        List<Ciclista> ciclistas = new ArrayList<>();
        try {
            String json = new String(Files.readAllBytes(Paths.get(filename)));
            ObjectMapper objectMapper = new ObjectMapper();
            ciclistas = objectMapper.readValue(json, new TypeReference<List<Ciclista>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ciclistas;
    }

    private static Map<Integer, Integer> cargarTiemposEtapaDeJson(String filename) {
        Map<Integer, Integer> tiempos = new HashMap<>();
        try {
            String json = new String(Files.readAllBytes(Paths.get(filename)));
            ObjectMapper objectMapper = new ObjectMapper();
            tiempos = objectMapper.readValue(json, new TypeReference<Map<Integer, Integer>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tiempos;
    }
}
