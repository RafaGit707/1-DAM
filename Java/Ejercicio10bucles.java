package Java;

import java.util.Scanner;

public class Ejercicio10bucles {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int num;
      int suma = 0;
      int contador = 0;

      do {
         System.out.println("Introduce un numero positivo (Introduce 0 o un numero negativo para salir)");
         num = sc.nextInt();

         if (num > 0)
         {
         suma += num;
         contador++;
         }
      } while (num > 0);

      float media = (float)suma/contador;
      System.out.println("La media es :" + media);
   
   }

}
