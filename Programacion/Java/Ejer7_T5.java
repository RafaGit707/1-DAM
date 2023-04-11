package Java;

import java.util.Scanner;

public class Ejer7_T5 {

   static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {
      
      int [] arrayNumeros = new int[100];

      generarAleatorios(arrayNumeros);

      imprimirArrays(arrayNumeros);

      System.out.println("¿Que numero desea modificar?");
      int numeroBuscado = sc.nextInt();

      System.out.println("¿Cual sera el numero nuevo?");
      int numeroNuevo = sc.nextInt();

      modificarArray(arrayNumeros, numeroBuscado, numeroNuevo);

      imprimirArrays(arrayNumeros, numeroNuevo);

      static void imprimirArrays (int[] array, int[] valorDestino, boolean[] posiciones)
   {
      for (int i = 0; i < arrayDestino.length; i++)
      {
         if (int i = 0; i < array.length; i++)
         {
            
         }
      }
   }

   }

}
