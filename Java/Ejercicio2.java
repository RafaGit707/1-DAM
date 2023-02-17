package java;

import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      //Nombre del jugador atacante y del jugador defensor
      //El % de acierto de 2  y de 3 del jugador atacante.
      //El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10)
      //Y si el jugador atacante decide tirar de 2 o de 3.

      System.out.println("Introduzca el nombre de jugador atacante: ");
      String jugadorAtacante = sc.next();

      System.out.println("Introduzca el nombre de jugador defensor: ");
      String jugadorDefensor = sc.next();

      double AzarAtacante = Math.random();
      double AzarDefensor = Math.random();

      System.out.println("Introdcuzca el porcentaje de acierto de 2 de " + jugadorAtacante + " es:");
      int aciertoAtacante2 = sc.nextInt();

      System.out.println("Introdcuzca el porcentaje de acierto de 3 de " + jugadorAtacante + " es:");
      int aciertoAtacante3 = sc.nextInt();

      System.out.println("Introduzca el numero de veces que " + jugadorDefensor + " logra defender");
      int defensaDefensor = sc.nextInt();

      System.out.println("¿De que posicion decide tirar?");
      System.out.println("1 --> Tirar de 2");
      System.out.println("2 --> Tirar de 3");
      int seleccion = sc.nextInt();

      boolean meteCanasta2 = (AzarAtacante * aciertoAtacante2) > (AzarDefensor * defensaDefensor * 10);
      boolean meteCanasta3 = (AzarDefensor * aciertoAtacante3) > (AzarDefensor * defensaDefensor * 10);

      String mensajeCanasta2 = ("¿El jugador " + jugadorAtacante + " ha encestado de 2? " + meteCanasta2);
      String mensajeCanasta3 = ("¿El jugador " + jugadorAtacante + " ha encestado de 3? " + meteCanasta3);
      String defiendeCanasta2 = ("¿El jugador " + jugadorDefensor + " ha defendido de 2? " + !meteCanasta2);
      String defiendeCanasta3 = ("¿El jugador " + jugadorDefensor + " ha defendido de 3? " + !meteCanasta3);

      System.out.println((seleccion == 1)? mensajeCanasta2: mensajeCanasta3);
      System.out.println((seleccion == 1)? defiendeCanasta2: defiendeCanasta3);

      sc.close();
   }
}