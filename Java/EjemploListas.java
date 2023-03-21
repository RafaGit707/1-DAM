import java.util.*;

public class EjemploListas {

    public static void main(String[] args) {
        // Creamos una lista de 20 números enteros aleatorios entre 1 y 10
        List<Integer> listaNumeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            listaNumeros.add(rand.nextInt(10) + 1);
        }
        
        // Creamos un conjunto con los elementos de la lista sin repetir
        Set<Integer> conjuntoSinRepetir = new HashSet<>(listaNumeros);
        
        // Creamos un conjunto con los elementos repetidos
        Set<Integer> conjuntoRepetidos = new HashSet<>();
        Set<Integer> auxiliar = new HashSet<>();
        for (Integer numero : listaNumeros) {
            if (!auxiliar.add(numero)) {
                conjuntoRepetidos.add(numero);
            }
        }
        
        // Creamos un conjunto con los elementos que aparecen una sola vez en la lista original
        Set<Integer> conjuntoUnicas = new HashSet<>();
        for (Integer numero : conjuntoSinRepetir) {
            if (!conjuntoRepetidos.contains(numero)) {
                conjuntoUnicas.add(numero);
            }
        }
        
        // Mostramos los conjuntos resultantes
        System.out.println("Lista original: " + listaNumeros);
        System.out.println("Conjunto sin repetir: " + conjuntoSinRepetir);
        System.out.println("Conjunto repetidos: " + conjuntoRepetidos);
        System.out.println("Conjunto elementos únicos: " + conjuntoUnicas);
    }
}