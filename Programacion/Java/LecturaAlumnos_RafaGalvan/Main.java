import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("ficheroAlumnos.txt"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\s+");

                String sexo = values[0];
                int edad = Integer.parseInt(values[1]);
                double estatura = Double.parseDouble(values[2].replace(',', '.'));
                int puntuacion1 = Integer.parseInt(values[3]);
                int puntuacion2 = Integer.parseInt(values[4]);
                String calificacion = values[5];

                Alumno alumno = new Alumno(sexo, edad, estatura, puntuacion1, puntuacion2, calificacion);
                alumnos.add(alumno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenar alumnos por edad
        Collections.sort(alumnos, (a1, a2) -> Integer.compare(a1.getEdad(), a2.getEdad()));

        // Mostrar la media de la edad
        double mediaEdad = alumnos.stream().mapToInt(Alumno::getEdad).average().orElse(0);
        System.out.println("Media de la edad: " + mediaEdad);

        // Mostrar el número total de alumnos
        int numAlumnos = alumnos.size();
        System.out.println("Número total de alumnos: " + numAlumnos);

        // Mostrar el número de suspensos
        long numSuspenso = alumnos.stream().filter(a -> a.getCalificacion().equals("Suspenso")).count();
        System.out.println("Número de suspensos: " + numSuspenso);

        // Mostrar el número de mujeres
        long numMujeres = alumnos.stream().filter(a -> a.getSexo().equals("Mujer")).count();
        System.out.println("Número de mujeres: " + numMujeres);

        // Mostrar el número de mujeres suspensas
        long numMujeresSuspenso = alumnos.stream().filter(a -> a.getSexo().equals("Mujer") && a.getCalificacion().equals("Suspenso")).count();
        System.out.println("Número de mujeres suspensas: " + numMujeresSuspenso);
    }
}
