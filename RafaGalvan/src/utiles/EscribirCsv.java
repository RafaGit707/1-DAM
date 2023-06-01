import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirCsv {
    public static void generarArchivoCsv(List<Alumno> alumnos, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Escribir encabezado del archivo
            writer.write("nombreAlumno;dni;notaMedia\n");

            for (Alumno alumno : alumnos) {
                String nombreAlumno = alumno.getNombre();
                String dni = alumno.getDni();

                if (dni.isEmpty()) {
                    throw new NoExisteDNIException("El alumno " + nombreAlumno + " no tiene DNI, no se puede procesar su información");
                }

                double notaMedia = calcularNotaMedia(alumno.getNotas());

                // Escribir información del alumno en el archivo
                writer.write(nombreAlumno + ";" + dni + ";" + notaMedia + "\n");
            }

            System.out.println("Archivo infoAlumnos.csv generado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } catch (NoExisteDNIException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static double calcularNotaMedia(List<NotaAsignatura> notas) {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (NotaAsignatura nota : notas) {
            sum += nota.getNota();
        }

        return sum / notas.size();
    }
}
