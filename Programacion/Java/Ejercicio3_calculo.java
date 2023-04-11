package Java;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_calculo {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int aleatorio1 = (int)(Math.random() *100);
      System.out.println("El numero aleatorio 1 es " + aleatorio1);

      int aleatorio2 = (int)(Math.random() *100);
      System.out.println("El numero aleatorio 2 es " + aleatorio2);

      int resultado = 0;

      double operacion1 = Math.floor(Math.random() * 3+1);

      if (operacion1 == 1)
      {
         resultado = aleatorio1 + aleatorio2;
         System.out.println("Se ha sumado " + aleatorio1 + " + " + aleatorio2 + " y el resultado es " + resultado);
      }

      else if (operacion1 == 2)
      {
         resultado = aleatorio1 - aleatorio2;
         System.out.println("Se ha restado " + aleatorio1 + " - " + aleatorio2 + " y el resultado es " + resultado);
      }

      else if (operacion1 == 3)
      {
         resultado = aleatorio1 * aleatorio2;
         System.out.println("Se ha multiplicado " + aleatorio1 + " * " + aleatorio2 + " y el resultado es " + resultado);
      }


   }
}