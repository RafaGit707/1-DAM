package Java;

import java.util.Scanner;

public class Ejercicio28 {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Jugador 1: Introduzca una opcion: (piedra, papel, tijeras)");
      String jugador1 = sc.nextLine();

      System.out.println("Jugador 2: Introduzca una opcion: (piedra, papel, tijeras)");
      String jugador2 = sc.nextLine();
      
      String resultado = "";
      String Error = "";

      if (jugador1.equals("piedra"))
      {
         if (jugador2.equals("tijeras"))
         {
         System.out.println(resultado = "Gana Jugador 1");
         }
         else if (jugador2.equals("piedra"))
         {
         System.out.println(resultado = "Empate");
         }
         else if (jugador2.equals("papel"))
         {
         System.out.println(resultado = "Gana Jugador 2");
         }
         else 
         {
         System.out.println(Error = "No has introducido un valor correcto");
         }
      }
      else if (jugador1.equals("papel"))
      {
         if (jugador2.equals("tijeras"))
         {
            System.out.println(resultado = "Gana Jugador 2");
         }
         else if (jugador2.equals("piedra"))
         {
            System.out.println(resultado = "Gana Jugador 1");
         }
         else if (jugador2.equals("papel"))
         {
            System.out.println(resultado = "Empate");
         }
         else 
         {
         System.out.println(Error = "No has introducido un valor correcto");
      }
      }
      else if (jugador1.equals("tijeras"))
      {
         if (jugador2.equals("tijeras"))
         {
            System.out.println(resultado = "Empate");
         }
         else if (jugador2.equals("piedra"))
         {
            System.out.println(resultado = "Gana Jugador 2");
         }
         else if (jugador2.equals("papel"))
         {
            System.out.println(resultado = "Gana Jugador 1");
         }
         else 
         {
         System.out.println(Error = "No has introducido un valor correcto");
         }
      }
      
   }

}
