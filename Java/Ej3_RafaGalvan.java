package Java;

import java.util.Scanner;

public class Ej3_RafaGalvan {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int aux = 1;
   
      System.out.println("\nNumeros del 1 al 100: ");                                           
      
      do {

      for (aux = 1; aux <= 100; aux++)
      {
         
         if (aux % 10 == 0)
         {
            System.out.print("\n");
            if(aux % 5 == 0)
            {
               System.out.print("Multiplo de 5, ");
            }
         }
         else if(aux % 5 == 0 && aux % 3 == 0)
         {
            System.out.print("Multiplo de 3 y 5, ");
         }

         else if(aux % 5 == 0)
         {
            System.out.print("Multiplo de 5, ");
         }
         else if(aux % 3 == 0)
         {
            System.out.print("Multiplo de 3, ");
         }
         else 
         {
            System.out.print(aux + ", ");
         }
         
      }

      } while (aux == 100);

      sc.close();
   }

}
