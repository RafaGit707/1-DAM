package Java.Municipios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LeerInformacion {

    public static ArrayList<Municipio> LeerFicheroMunicipio(Integer año) {

        ArrayList<Municipio> listMunicipios = new ArrayList<>();
        BufferedReader br = null;

        try {

            String rutaArchivo = "PoblacionMunicipiosMalaga.csv";
            br = new BufferedReader(new FileReader(rutaArchivo));

            if (rutaArchivo.isEmpty()) {
                System.out.println("No se encontraron m.");
            }

            String line = br.readLine();
            final String[] split1 = line.split(" ", 2);
            final String[] split2 = split1[1].split(";");
        
            while ((line = br.readLine()) != null) {

                try {
                        String codPostal = split1[0];
                        String nombre = split2[1];
                        String sexo = split2[2];
                        int año1 = Integer.valueOf(split2[3]);
                        int poblacion = Integer.valueOf(split2[4].replace(".", ""));
        
                        Municipio m = new Municipio(codPostal, nombre, año1, poblacion); 
        
                        if (año1 == año && sexo.equals("Todos")) {
                            listMunicipios.add(m);
                        }
                    
                    } catch (Exception ee) {
                        ee.getMessage();
                    }
                }

                br.close();

                } catch (Exception e) {
                    e.getMessage();
                }
            Collections.sort(listMunicipios);
            return listMunicipios; // Devuelve la lista de municipios
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
        HashMap<String, Integer> incrementos = new HashMap<>();
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

    public static void escribir(String cadena) {

        String nombreFichero = "salida.txt";
        String path = "../1-DAM/Programacion/Java/Municipios/";

        try (FileWriter fw = new FileWriter(path + nombreFichero, true);
            BufferedWriter bw = new BufferedWriter(fw)) {

                
            bw.write(cadena);
            bw.newLine();

            
        } catch (Exception e) {
            System.out.println(e);
        }    
    }

}
