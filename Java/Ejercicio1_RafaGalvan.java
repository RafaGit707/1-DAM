package Java;

import java.util.Scanner;

public class Ejercicio1_RafaGalvan {
   
   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   int plato = 0;

   double cantidadPlato = 0;

   final double PLATO1 = 5;
   final double PLATO2 = 4;
   final double PLATO3 = 4.5;
   final double PLATO4 = 6;
   final double PLATO5 = 8;
   final double PLATO6 = 9;
   final double PLATO7 = 5;
   final double PLATO8 = 1.5;
   final double PLATO9 = 1.25;
   final double PLATO10 = 2;

   double precioPrimerPlato = 0;
   double precioSegundoPlato = 0;
   double precioPostre = 0;

   double precioTotal = 0;

   boolean salir = false;

   do {

   while (!salir)
   {

      System.out.println(" *** RESTAURANTE VEGA DE MIJAS *** ");
      System.out.println(" --------------------------------- ");
      System.out.println("Primeros platos");
      System.out.println(" 1. Salmorejo (5€)");
      System.out.println(" 2. Sopa picadillo (4€)");
      System.out.println(" 3. Ensalada de atún (4.5€)");
      System.out.println("Segundos platos");
      System.out.println(" 4. Paella (6€)");
      System.out.println(" 5. Salmón (8€)");
      System.out.println(" 6. Codillo al horno (9€)");
      System.out.println(" 7. Lentejas (5€)");
      System.out.println("Postres");
      System.out.println(" 8. Fruta (1.5€)");
      System.out.println(" 9. Café (1.25€)");
      System.out.println("10. Helado (2€)");
      System.out.println();
      System.out.println();
      System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
      System.out.println("Selecciona la opción deseada por el cliente...");
      plato = sc.nextInt();

      if (plato == 0)
      {
         salir = true;
      }

      System.out.println("Introduzca la cantidad de dicho plato");
      System.out.println("Si desea salir vuelva a pulsar 0");
      cantidadPlato = sc.nextDouble();

      switch (plato)
   {
      case 1:
      precioPrimerPlato = PLATO1 * cantidadPlato;
         break;

      case 2:
      precioPrimerPlato = PLATO2 * cantidadPlato;
         break;

      case 3:
      precioPrimerPlato = PLATO3 * cantidadPlato;
         break;

      case 4:
      precioSegundoPlato = PLATO4 * cantidadPlato;
         break;

      case 5:
      precioSegundoPlato = PLATO5 * cantidadPlato;
         break;

      case 6:
      precioSegundoPlato = PLATO6 * cantidadPlato;
         break;

      case 7:
      precioSegundoPlato = PLATO7 * cantidadPlato;
         break;

      case 8:
      precioPostre = PLATO8 * cantidadPlato;
         break;

      case 9:
      precioPostre = PLATO9 * cantidadPlato;
         break;

      case 10:
      precioPostre = PLATO10 * cantidadPlato;
         break;

      case 0:
      salir = true;
         break;
   }

   }

   precioTotal = precioPrimerPlato + precioSegundoPlato + precioPostre;
   System.out.println("");
   System.out.println("Primeros platos");

   System.out.println("");
   System.out.println("----------------------------");
   System.out.println("Segundos Platos");

   //falta poner el plato que es en la cuenta //

   System.out.println("");
   System.out.println("----------------------------");
   System.out.println("Postres");

   System.out.println("");
   System.out.println("----------------------------");
   System.out.println("TOTAL A PAGAR: " + precioTotal);
   System.out.println("----------------------------");

   salir = true;
   
   } while (!salir);
   
   }

}
