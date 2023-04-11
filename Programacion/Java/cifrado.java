package Java;

import java.util.Scanner;

public class cifrado {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      String palabraCifrada = "";

      System.out.println("Introduce la frase que quieras cifrar:");
      String frase = sc.nextLine().toUpperCase();

      System.out.println("Dime el factor de cifrado:");
      int factor = sc.nextInt();
      
      System.out.println("Introduce la palabra que quieras cifrar:");
      String palabra = sc.nextLine();

      System.out.println("Dime el factor de cifrado:");
      int factor = sc.nextInt();

      String[] palabras = frase.split("");

      for(int apuntador = 0; apuntador <= palabra.length() - 1; apuntador++);
      {
         char caracterleido = palabra.charAt(apuntador);

         int numNuevoCaracter = (int)caracterleido + factor;

         if(numNuevoCaracter > 90)
         {
            numNuevoCaracter = ((numNuevoCaracter - 65) % 25) + 65;
         }

         char nuevoCaracter = (char)numNuevoCaracter;

         System.out.println("Caracter: " + caracterleido + "..." + nuevoCaracter);
      }

      

   }

}
