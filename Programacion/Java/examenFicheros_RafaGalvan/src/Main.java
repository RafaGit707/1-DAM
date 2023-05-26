import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Leer el archivo JSON
        List<Profesor> profesores = LeerJson.leerJson("src/recursos/profesores-alumnos-notas");

        List<Alumno> todosLosAlumnos = Instituto.getTodosLosAlumnosDeProfesores(profesores);
        for (Alumno alumno : todosLosAlumnos) {
            System.out.println(alumno);
        }

        // Generar archivo de texto con información de todos los alumnos
        String archivoAlumnosCsv = "infoAlumnos.csv";
        EscribirCsv.generarArchivoAlumnosCsv(profesores, archivoAlumnosCsv);

        // Generar archivo de texto con alumnos que tienen derecho a beca
        String archivoBecas = "src/recursos/becas2023.txt";
        String archivoAlumnosBeca = "AlumnosBeca2023.txt";
        EscribirTxt.generarArchivoAlumnosBeca(profesores, archivoBecas, archivoAlumnosBeca);

        // Generar archivo JSON con la colección de alumnos de la profesora "Ana Garcia"
        String archivoAlumnosAnaGarciaJson = "AlumnosAnaGarcia.json";
        EscribirJson.generarArchivoAlumnosAnaGarciaJson(profesores, archivoAlumnosAnaGarciaJson);
    }
}

