package Java;

import java.util.Scanner;

public class Ejercicio26bucles {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número entero: ");
      long numeroIntroducido = Integer.parseInt(System.console().readLine());

      

      System.out.println("Dime un numero del 0 al 9 para buscarlo en el anterior");
      int digitoBuscado = Integer.parseInt(System.console().readLine());
      int alReves = 0;

      while (numero > 0)
      {
         alReves = (alReves * 10) + (numero % 10);
         numero /= 10;
      } //while

      String apariciones = "";
      int posicionActual = 1;

      while (numero > 0)
      {
         if (numero % 10 == digitoBuscado)
         {
            apariciones += posicionActual + ", ";
         }

         alReves /= 10; //alReves = alReves / 10
         posicionActual++;
      }

      System.out.println("El digito " + digitoBuscado + " esta en el numero: " + numeroIntroducido);

   }
   
}
