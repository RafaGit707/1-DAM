import java.util.List;

public class Main {
    public static void main(String[] args) {

        String archivoJson = "ruta/al/archivo.json";
        List<Profesor> profesores = LeerJson.leerJson(archivoJson);

        // Obtener la lista de alumnos de la profesora "Ana Garcia"
        List<Alumno> alumnosAnaGarcia = Instituto.obtenerAlumnosPorProfesor(profesores, "Ana Garcia");

        // Generar el archivo CSV con la información de todos los alumnos
        EscribirCsv.generarArchivoCsv(Instituto.obtenerTodosLosAlumnosDeProfesores(profesores), "infoAlumnos.csv");

        // Generar el archivo de texto con los alumnos que tienen derecho a beca
        //Instituto.generarArchivoAlumnosBeca(profesores, "becas2023.txt", "AlumnosBeca2023.txt");

        // Generar el archivo JSON con la colección de alumnos de la profesora "Ana Garcia"
        //JsonParser.escribirJson(alumnosAnaGarcia, "AlumnosAnaGarcia.json");
    }
}


