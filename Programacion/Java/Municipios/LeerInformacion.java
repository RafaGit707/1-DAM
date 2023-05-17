package Java.Municipios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeerInformacion {

    public static ArrayList<Municipio> LeerFicheroMunicipio(Integer año) {

        ArrayList<Municipio> municipios = new ArrayList<>();
        BufferedReader br = null;
        FileReader fr = null;

        String line = "";
        final String[] split2 = line.split(" ", 2);
        final String[] split1 = split2[1].split(";");
    
        try {
            fr = new FileReader("../1-DAM/Programacion/Java/Municipios/PoblacionMunicipiosMalaga.csv");
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {

                String codPostal = split2[0];
                String nombre = split1[0];
                String sexo = split1[1];
                int año1 = Integer.valueOf(split1[2]);
                int poblacion = Integer.valueOf(split1[3].replace(".", ""));

                Municipio m = new Municipio(codPostal, nombre, año1, poblacion); 

                if (sexo.equals("Todos")) {
                    municipios.add(m);
                }
            
            }
        } catch (Exception e) {
            e.getMessage();
        }
            Collections.sort(municipios);
            return municipios; // Devuelve la lista de municipios
        }
        
    

    public static Municipio BuscarMunicipio(ArrayList<Municipio> municipios, String nombre, Integer año) {
        Municipio municipioBuscado = null;
        for (Municipio m : municipios) {
            if (m.getNombre().equals(nombre) && m.getAño() == año) {
                municipioBuscado = m;
                break;
            }
        }
        return municipioBuscado;
    }
    
    public static Map<String, Integer> IncrementoPoblacion(ArrayList<Municipio> municipios, int año1, int año2) {
        Map<String, Integer> incrementos = new HashMap<>();
        for (int i = 0; i < municipios.size(); i++) {
            Municipio m1 = municipios.get(i);
            if (m1.getAño() == año1) {
                for (int j = i + 1; j < municipios.size(); j++) {
                    Municipio m2 = municipios.get(j);
                    if (m2.getAño() == año2 && m1.getNombre().equals(m2.getNombre())) {
                        incrementos.put(m1.getNombre(), m2.getPoblacion() - m1.getPoblacion());
                        break;
                    }
                }
            }
        }
        return incrementos;
    }

    public static Municipio MunicipioMenosPoblado(ArrayList<Municipio> municipios, Integer año) {
        Municipio municipioMenosPoblado = null;
        int minPoblacion = Integer.MAX_VALUE;
        for (Municipio m : municipios) {
            if (m.getAño() == año && m.getPoblacion() < minPoblacion) {
                municipioMenosPoblado = m;
                minPoblacion = m.getPoblacion();
            }
        }
        return municipioMenosPoblado;
    }

}
