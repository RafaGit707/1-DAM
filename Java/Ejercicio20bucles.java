package Java;

import java.util.Scanner;

public class Ejercicio20bucles {
   
   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   System.out.println("Introduce la altura de la piramide");
   int alturaPiramide = sc.nextInt();

   int altura = 1;
   int i = 0;
   int numeroEspacios = alturaPiramide - 1;
   int espaciosInternos = 0;

      for (int aux = 1; aux < altura; aux++)
      {
         System.out.print("*");
      }

      System.out.println("");
      
      
      while (altura < alturaPiramide) {
      
      for (i = 1; i <= numeroEspacios; i++)
      {
         System.out.print(" ");
      }
      
      System.out.print("*");
      for (i = 1; i < espaciosInternos; i++)
      {
         System.out.print(" ");
      }
      
      if (altura > 1)
      {
         System.out.print("*");
      }
      
      System.out.println();
      altura++;
      numeroEspacios--;
      espaciosInternos += 2;
      } 
      
      for (i = 1; i < altura*2; i++)
      {
         System.out.print("*");
      }

   }

}