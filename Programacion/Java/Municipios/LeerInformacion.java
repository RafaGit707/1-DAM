package Java.Municipios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeerInformacion {

    public static ArrayList<Municipio> LeerFicheroMunicipio(Integer año) {
        ArrayList<Municipio> municipios = new ArrayList<Municipio>();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy1 = ";";

        try {
            br = new BufferedReader(new FileReader("PoblacionMunicipiosMalaga.csv"));
            while ((line = br.readLine()) != null) {
                String[] registro = line.split(cvsSplitBy1);
                if (año == null || año.equals(Integer.parseInt(registro[3]))) {
                    if (poblacion[1].equals("Todos")) {
                        Municipio m = new Municipio(registro[0], registro[2], Integer.parseInt(registro[3]), Integer.parseInt(registro[4]));
                        municipios.add(m);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Collections.sort(municipios);
        return municipios;
    }

    public static Municipio BuscarMunicipio(ArrayList<Municipio> coleccionMunicipios, String nombre, Integer año) {
        Municipio municipioBuscado = null;
        for (Municipio m : coleccionMunicipios) {
            if (m.getNombre().equals(nombre) && m.getAño() == año) {
                municipioBuscado = m;
                break;
            }
        }
        return municipioBuscado;
    }

    public static HashMap<String, Integer> IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int año1, int año2) {
        HashMap<String, Integer> incrementos = new HashMap<String, Integer>();
        for (int i = 0; i < coleccionMunicipios.size(); i++) {
            Municipio m1 = coleccionMunicipios.get(i);
            if (m1.getAño() == año1) {
                for (int j = i + 1; j < coleccionMunicipios.size(); j++) {
                    Municipio m2 = coleccionMunicipios.get(j);
                    if (m2.getAño() == año2 && m1.getNombre().equals(m2.getNombre())) {
                        incrementos.put(m1.getNombre(), m2.getPoblacion() - m1.getPoblacion());
                        break;
                    }
                }
            }
        }
        return incrementos;
    }

    public static Municipio MunicipioMenosPoblado(ArrayList<Municipio> coleccionMunicipios, Integer año) {
        Municipio municipioMenosPoblado = null;
        int minPoblacion = Integer.MAX_VALUE;
        for (Municipio m : coleccionMunicipios) {
            if (m.getAño() == año && m.getPoblacion() < minPoblacion) {
                municipioMenosPoblado = m;
                minPoblacion = m.getPoblacion();
            }
        }
        return municipioMenosPoblado;
    }

}

