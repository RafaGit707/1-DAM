package Java.Municipios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Leer todos los municipios
        ArrayList<Municipio> todosMunicipios = LeerInformacion.LeerFicheroMunicipio(null);

        // Ordenar los municipios por nombre y año
        Collections.sort(todosMunicipios);
        
        // Información de Mijas en 2022
        Municipio mijas2022 = LeerInformacion.BuscarMunicipio(todosMunicipios, "Mijas", 2022);
        System.out.println(mijas2022);
        
        // Incremento de la población de Fuengirola del año 2016 al 2022
        HashMap<String, Integer> incrementoFuengirola = LeerInformacion.IncrementoPoblacion(todosMunicipios, 2016, 2022);
        int incremento = incrementoFuengirola.get("Fuengirola");
        System.out.println("Incremento de la población de Fuengirola (2016-2022): " + incremento);
        
        // Incremento de la población de Mijas del año 2016 al 2022
        HashMap<String, Integer> incrementoMijas = LeerInformacion.IncrementoPoblacion(todosMunicipios, 2016, 2022);
        incremento = incrementoMijas.get("Mijas");
        System.out.println("Incremento de la población de Mijas (2016-2022): " + incremento);
        
        // Municipio menos poblado en 2021
        ArrayList<Municipio> municipios2021 = LeerInformacion.LeerFicheroMunicipio(2021);
        Municipio menosPoblado = municipios2021.get(0);
        for (Municipio municipio : municipios2021) {
            if (municipio.getPoblacion() < menosPoblado.getPoblacion()) {
                menosPoblado = municipio;
            }
        }
        System.out.println("Municipio menos poblado en 2021: " + menosPoblado);
    }
}

