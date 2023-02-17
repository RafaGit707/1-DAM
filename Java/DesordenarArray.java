package Java;

import java.util.Arrays;
import java.util.Collections;

public class DesordenarArray {
  public static void main(String[] args) {
    // Creamos un array de enteros
    Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Desordenamos el array
    Collections.shuffle(Arrays.asList(numeros));

    // Imprimimos el array desordenado
    System.out.println(Arrays.toString(numeros));
  }
}
