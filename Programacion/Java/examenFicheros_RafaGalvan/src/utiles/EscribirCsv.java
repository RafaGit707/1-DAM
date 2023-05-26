import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirCsv {

    public static void generarArchivoAlumnosCsv(List<Profesor> profesores, String nombreArchivo) {
        Instituto instituto = new Instituto(profesores);

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            for (Alumno alumno :  instituto.getTodosLosAlumnosDeProfesores()) {
                if (alumno.getDni().isEmpty()) {
                    throw new NoExisteDNIException("El alumno " + alumno.getNombre() + " no tiene DNI, no se puede procesar su información");
                }
                writer.write(alumno.getNombre() + ";" + alumno.getDni() + ";" + alumno.getNotaMedia() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoExisteDNIException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
}
