package Java;

import java.util.Scanner;

public class Ejercicio19bucles {
   
   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
      
   System.out.println("Introduce la altura de la piramide");
   int alturaPiramide = sc.nextInt();

   for (int altura = 1; altura <= alturaPiramide; altura++)
   {
      for(int numeroEspacios = 0; numeroEspacios < alturaPiramide - altura; numeroEspacios++)
      {
         System.out.print(" ");
      }

      for (int aux = 0; aux < altura; aux++)
      {
         System.out.print("*");
      }

      for (int aux = 1; aux < altura; aux++)
      {
         System.out.print("*");
      }

      System.out.println("");
      

   }

   }
}
