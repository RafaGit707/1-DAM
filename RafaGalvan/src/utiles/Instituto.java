import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Instituto {
    private List<Profesor> profesores;

    public Instituto(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    // Getters y setters

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public static List<Alumno> obtenerAlumnosPorProfesor(List<Profesor> profesores, String nombreProfesor) {
        List<Alumno> alumnosPorProfesor = new ArrayList<>();

        // Recorrer la lista de profesores
        for (Profesor profesor : profesores) {
            // Verificar si el nombre del profesor coincide
            if (profesor.getNombre().equals(nombreProfesor)) {
                // Obtener la lista de alumnos del profesor
                List<Alumno> alumnos = profesor.getAlumnos();
                // Agregar los alumnos a la lista específica
                alumnosPorProfesor.addAll(alumnos);
                break; // No es necesario seguir recorriendo la lista de profesores
            }
        }

        return alumnosPorProfesor;
    }

    public static List<Alumno> obtenerTodosLosAlumnosDeProfesores(List<Profesor> profesores) {
        List<Alumno> todosLosAlumnos = new ArrayList<>();

        // Recorrer la lista de profesores
        for (Profesor profesor : profesores) {
            // Obtener la lista de alumnos del profesor
            List<Alumno> alumnos = profesor.getAlumnos();
            // Agregar los alumnos a la lista general
            todosLosAlumnos.addAll(alumnos);
        }

        return todosLosAlumnos;
    }

    // public static void generarArchivoAlumnosBeca(List<Profesor> profesores, String archivoBecas, String archivoSalida) {
    //     try {
    //         // Leer el archivo de becas y obtener la relación de asignatura y nota de corte
    //         Map<String, Double> becas = LeerArchivoBecas.leerBecas(archivoBecas);

    //         // Crear el escritor de archivos de texto
    //         BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));

    //         // Recorrer la lista de profesores
    //         for (Profesor profesor : profesores) {
    //             // Recorrer la lista de alumnos del profesor
    //             for (Alumno alumno : profesor.getAlumnos()) {
    //                 // Recorrer las asignaturas y notas del alumno
    //                 for (Map.Entry<String, Double> entry : alumno.getNotas().entrySet()) {
    //                     String asignatura = entry.getKey();
    //                     Double nota = entry.getValue();

    //                     // Verificar si la asignatura tiene una nota de corte para beca
    //                     if (becas.containsKey(asignatura) && nota >= becas.get(asignatura)) {
    //                         // Escribir el alumno y su nota en el archivo de salida
    //                         writer.write("== " + asignatura + " ==\n");
    //                         writer.write(alumno.getNombre() + ": " + nota + "\n");
    //                     }
    //                 }
    //             }
    //         }

    //         // Cerrar el escritor de archivos
    //         writer.close();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    //}

}
