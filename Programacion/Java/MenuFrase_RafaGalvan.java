package Java;

import java.util.Scanner;

public class MenuFrase_RafaGalvan {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Opcion a - Añadir a la frase (añadiendo al final de la frase ya existente)");
      System.out.println("Opción b - Indicar la ultima frase introducida");
      System.out.println("Opción c - Indicar el número de palabras que tiene la frase");
      System.out.println("Opción d - Indicar cuantas veces a aparece un carácter en la frase");
      System.out.println("Opción e - Limpiar frase");
      System.out.println("Opción s - Salir");
      char opcion = sc.nextLine().charAt(0);


      switch (opcion) {

         case 'a':
            System.out.println("");
            break;
         
         case 'b':
         System.out.println("");
            break;

         case 'c':
         System.out.println("");
            break;
         
         case 'd':
         System.out.println("");
            break;

         case 'e':
         System.out.println("");
            break;
         
         case 's':
         System.out.println("");
            break;

      }

   }

}
