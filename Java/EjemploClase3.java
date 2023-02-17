package Java;

import java.util.Scanner;

public class EjemploClase3 {

   public static void main(String[] args) {

      /*Segun el numero que introduzca indicar el dia de la semana*/

   Scanner sc = new Scanner(System.in);
   System.out.println("Indica el dia de la semana");
   int diaSemana = sc.nextInt();
   
   if (diaSemana == 1) {
      System.out.println("Lunes");
   }
   else if (diaSemana == 2) {
      System.out.println("Martes");
   }
   else if (diaSemana == 3) {
      System.out.println("Miercoles");
   }
   else if (diaSemana == 4) {
      System.out.println("Jueves");
   }
   else if (diaSemana == 5) {
      System.out.println("Viernes");
   }
   else if (diaSemana == 6) {
      System.out.println("Sabado");
   }
   else if (diaSemana == 7) {
      System.out.println("Domingo");
   }
   else 
   {
      System.out.println("Has introducido un numero no valido");
   }
}
}