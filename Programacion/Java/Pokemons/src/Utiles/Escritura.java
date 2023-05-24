package Utiles;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Escritura {

    public static void escribir(String cadena) throws Exception {

        String nombreFichero = "consultasPokemon.txt";
        String path = "src/recursos/";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(path + nombreFichero, true);
            bw = new BufferedWriter(fw);

                
            bw.write(cadena);
            bw.newLine();

            
        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                if (bw != null) {
                    
                    bw.close();

                }
                if (fw != null) {

                    fw.close();
                    
                }

            } catch (Exception e) {

                System.out.println(e);

            }

        } 

    }
    
}
