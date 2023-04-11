package Java.Academia;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.TreeMap;
import java.util.HashMap;

public class AcademiaLengua {
    public static void main(String[] args) {

        HashMap<Character, Academico> academia = new TreeMap<>();
        nuevoAcademico(academia, new Academico("Juan", 2010), 'J');
        nuevoAcademico(academia, new Academico("María", 2015), 'M');
        nuevoAcademico(academia, new Academico("Luis", 2005), 'L');
        nuevoAcademico(academia, new Academico("Ana", 2020), 'A');
        nuevoAcademico(academia, new Academico("Pedro", 1999), 'P');
        
        System.out.println("Listado de académicos sin letra:");
        List<Academico> academicos = new ArrayList<>(academia.values());
        Collections.sort(academicos);
        for (Academico academico : academicos) {
            System.out.println(academico.getNombre() + " - " + academico.getAñoIngreso());
        }

        System.out.println("\nListado de académicos con letra:");
        for (HashMap.Entry<Character, Academico> entry : academia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNombre() + " - " + entry.getValue().getAñoIngreso());
        }
        }

        public static boolean nuevoAcademico(HashMap<Character, Academico> academia, Academico nuevo, Character letra) {
        if (!Character.isLetter(letra)) {
            return false;
        }
        letra = Character.toUpperCase(letra);
        if (academia.containsKey(letra)) {
            return false;
        }
        academia.put(letra, nuevo);
        return true;
    }
    
}

