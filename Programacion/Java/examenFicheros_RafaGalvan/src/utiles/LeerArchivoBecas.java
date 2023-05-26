import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LeerArchivoBecas {
    public static Map<String, Double> leerBecas(String archivoBecas) {
        Map<String, Double> becas = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoBecas))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String asignatura = parts[0].trim();
                    double notaCorte = Double.parseDouble(parts[1].trim());
                    becas.put(asignatura, notaCorte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return becas;
    }
}

