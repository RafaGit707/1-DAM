import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EscribirTxt {
    public static void generarArchivoAlumnosBeca(List<Profesor> profesores, String archivoBecas, String archivoSalida) {
        try {
            // Leer el archivo de becas y obtener la relación de asignatura y nota de corte
            Map<String, Double> becas = LeerArchivoBecas.leerBecas(archivoBecas);

            // Crear el escritor de archivos de texto
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));

            // Recorrer la lista de profesores
            for (Profesor profesor : profesores) {
                // Recorrer la lista de alumnos del profesor
                for (Alumno alumno : profesor.getAlumnos()) {
                    // Recorrer las asignaturas y notas del alumno
                    for (Map.Entry<String, Double> entry : alumno.getNotas().entrySet()) {
                        String asignatura = entry.getKey();
                        Double nota = entry.getValue();

                        // Verificar si la asignatura tiene una nota de corte para beca
                        if (becas.containsKey(asignatura) && nota >= becas.get(asignatura)) {
                            // Escribir el alumno y su nota en el archivo de salida
                            writer.write("== " + asignatura + " ==\n");
                            writer.write(alumno.getNombre() + ": " + nota + "\n");
                        }
                    }
                }
            }

            // Cerrar el escritor de archivos
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


