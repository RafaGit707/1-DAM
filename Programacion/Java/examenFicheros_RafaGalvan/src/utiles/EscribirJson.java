import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirJson {
    public static void generarArchivoAlumnosAnaGarciaJson(List<Profesor> profesores, String nombreArchivo) {
        Instituto instituto = new Instituto(profesores);
        List<Alumno> alumnosAnaGarcia = instituto.getAlumnosPorProfesor("Ana Garcia");

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            ObjectMapper objectMapper = new ObjectMapper();
            writer.write(objectMapper.writeValueAsString(alumnosAnaGarcia));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

