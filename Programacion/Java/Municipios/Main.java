package Java.Municipios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Leer todos los municipios
        ArrayList<Municipio> municipios = LeerInformacion.LeerFicheroMunicipio(null);

        // Ordenar los municipios por nombre y año
        Collections.sort(municipios);
        
        // Información de Mijas en 2022
        Municipio mijas2022 = LeerInformacion.BuscarMunicipio(municipios, "Mijas", 2022);
        System.out.println(mijas2022);

        // Información de Mijas en 2016
        Municipio mijas2016 = LeerInformacion.BuscarMunicipio(municipios, "Mijas", 2016);
        System.out.println(mijas2016);

        // Información de Fuengirola en 2022
        Municipio fuengirola2022 = LeerInformacion.BuscarMunicipio(municipios, "Fuengirola", 2022);
        System.out.println(fuengirola2022);

        // Información de Fuengirola en 2016
        Municipio fuengirola2016 = LeerInformacion.BuscarMunicipio(municipios, "Fuengirola", 2016);
        System.out.println(fuengirola2016);
        
        // Incremento de la población de Fuengirola del año 2016 al 2022

        if (fuengirola2022 != null && fuengirola2016 != null) {
            int incrementoFuengirola = fuengirola2022.getPoblacion() - fuengirola2016.getPoblacion();
            System.out.println("Incremento de la población de Fuengirola (2016-2022): " + incrementoFuengirola);
        } else {
            System.out.println("No se encontró información para Fuengirola en 2016 o 2022");
        }        

        // Incremento de la población de Mijas del año 2016 al 2022
        if (mijas2022 != null && mijas2016 != null) {
            int incrementoMijas = mijas2022.getPoblacion() - mijas2016.getPoblacion();
            System.out.println("Incremento de la población de Mijas (2016-2022): " + incrementoMijas);
        } else {
            System.out.println("No se encontró información para Mijas en 2016 o 2022");
        }  
        
        // Municipio menos poblado en 2021
        ArrayList<Municipio> municipios2021 = LeerInformacion.LeerFicheroMunicipio(2021);
        if (!municipios2021.isEmpty()) {
            Municipio menosPoblado = municipios2021.get(0);
            for (Municipio municipio : municipios2021) {
                if (municipio.getPoblacion() < menosPoblado.getPoblacion()) {
                    menosPoblado = municipio;
                }
            }
            System.out.println("Municipio menos poblado en 2021: " + menosPoblado);
        } else {
            System.out.println("La lista de municipios en 2021 está vacía.");
        }

    }
}

