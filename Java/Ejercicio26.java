package Java;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ejercicio26 {
   
   public static void main(String[] args) {

   final int precioNormal = 8;
   final int precioDiaEspectador = 5;
   final int precioDiaPareja = 11;

   int numeroEntradas = 0;
   String diaSemana = "";
   String tieneTarjeta = "";
   double descuento = 0;
   double precioSinDescuento = 0;
   double precioFinal = 0;

   Scanner sc = new Scanner(System.in);
   System.out.println("Numero de entradas: ");
   numeroEntradas = sc.nextInt();

   Scanner sc = new Scanner(System.in);
   System.out.println("Dia de la semana: ");
   diaSemana = sc.nextInt();

   Scanner sc = new Scanner(System.in);
   System.out.println(": ");
    = sc.nextInt();



   System.out.println("Dia de la semana");

   switch (diaSemana.toLowerCase())
      {
         case "miercoles":
         precioSinDescuento = numeroEntradasParejas * precioDiaEspectador;
         break;

         case "jueves":
         int numeroEntradasParejas = numeroEntradas / 2;
         int numeroEntradasSueltas = numeroEntradas % 2;

         precioSinDescuento = numeroEntradasParejas * precioDiaPareja;
         break;

         default:
         precioSinDescuento = numeroEntradas * precioNormal;
         break;
      }


      if (tieneTarjeta.equals("s"))
      {
         descuento = precioSinDescuento * (0.1);
      }
      precioFinal = precioSinDescuento - descuento;

      System.out.printf("Aqui tiene sus entradas. Gracias por su compra \n");

      if (numeroEntradasParejas > 0)
      {
         System.out.printf("Precio por entrada pareja = %.2d", precioDiaPareja);
         System.out.printf("Entradas parejas: %d \n", numeroEntradas);

      }
      else 
      {
         System.out.printf("Precio por entrada = %d \n", precioNormal);
         System.out.printf("Entradas parejas: %d \n", numeroEntradas);
      }
      System.out.printf("Total %.2f \n", precioSinDescuento);
      System.out.printf("Descuento %.2f \n", - descuento);
      System.out.printf("A pagar %.2f \n", precioFinal);
}
}