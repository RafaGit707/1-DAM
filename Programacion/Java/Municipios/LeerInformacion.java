package Java.Municipios;

import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeerInformacion {

    public static ArrayList<Municipio> LeerFicheroMunicipio(Integer año) {
        ArrayList<Municipio> municipios = new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        final String split1 = ";";
        final String split2 = " ";
    
        // try {
        //     br = new BufferedReader(new FileReader("../1-DAM/Programacion/Java/Municipios/PoblacionMunicipiosMalaga.csv"));
        //     while ((line = br.readLine()) != null) {
        //         String[] registro = line.split(split1);
        //         String[] codPostal = registro[0].split(split2);
                
        //         // registro[0] = codPostal y el nombre
        //         // registro[2] = año
        //         // registro[3] = poblacion

        //         if (año == null || (registro[2].matches("\\d+") && año.equals(Integer.parseInt(registro[2])))) {
        //             if (registro[0].equals("Todos")) {
        //                 Municipio m = new Municipio(codPostal[0], codPostal[1], Integer.parseInt(registro[2]), Integer.parseInt(registro[3]));
        //                 municipios.add(m);
        //             }
        //         }
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     if (br != null) {
        //         try {
        //             br.close();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }

        try {
            br = new BufferedReader(new FileReader("../1-DAM/Programacion/Java/Municipios/PoblacionMunicipiosMalaga.csv"));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] registro = line.split(split1);
                String[] codPostal = registro[0].split(split2);

                String codPostal2 = registro[0];
                int edad = Integer.parseInt(registro[1]);
                double estatura = Double.parseDouble(registro[2]);
                int poblacion = Integer.parseInt(registro[3]);

                if (año == null || (registro[2].matches("\\d+") && año.equals(Integer.parseInt(registro[2])))) {
                    if (registro[0].equals("Todos")) {
                        Municipio m = new Municipio(codPostal[0], codPostal[1], Integer.parseInt(registro[2]), Integer.parseInt(registro[3]));
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

