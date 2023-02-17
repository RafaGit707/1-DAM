package Java;

import java.util.Scanner;

public class edades {
   
   public static void main(String[] args) {
      
      int maximo;
      int minimo;

      Scanner sc = new Scanner(System.in);
      System.out.println("Dime una edad");

      int edad = sc.nextInt();

      maximo = edad;
      minimo = edad;

      while (edad != -1)
      {
         maximo = Math.max(maximo, edad);
         minimo = Math.min(maximo, edad);

         System.out.println("DIme otra edad");
         edad = sc.nextInt();

      }

      if (maximo != -1)
      {
         System.out.println("La edad maxima es: " + maximo + " y la minima es: " + minimo);
      }
      else
      {
         System.out.println("No  has introducido ninguna edad valida");
      }

   }


}
