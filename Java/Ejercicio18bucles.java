package Java;

import java.util.Scanner;

public class Ejercicio18bucles {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      boolean iguales = false;
      int numero1;
      int numero2;

      do
      {
         System.out.println("Dime un numero");
         numero1 = sc.nextInt();

         System.out.println("Dime otro numero");
         numero2 = sc.nextInt();

         if (numero1 == numero2)
         {
            iguales = true;
            System.out.println("No pueden ser iguales, vuelve a decir los numeros");
         }
         else
         {
            iguales = false;
         }

      } while iguales;

   }

}
