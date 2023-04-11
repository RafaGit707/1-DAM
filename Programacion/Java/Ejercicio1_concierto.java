package Java;

import java.util.Scanner;

public class Ejercicio1_concierto {

   public static void main(String[] args) {
      
   Scanner sc = new Scanner(System.in);

   System.out.println("Introduce el aforo maximo del concierto");
   int aforoMax = sc.nextInt();

   System.out.println("Introduce el precio de las entradas");
   double precioEntradas = sc.nextDouble();

   System.out.println("Introduce el numero de entradas vendidas");
   int numeroEntradasVendidas = sc.nextInt();

   double precioEntradasConDescuento = precioEntradas * 0.75;

   if (numeroEntradasVendidas <= (aforoMax / 5))
   {
      System.out.println("El concierto se cancela");
   }
   else if (numeroEntradasVendidas > (aforoMax / 5) && numeroEntradasVendidas <= (aforoMax / 2))
   {
      System.out.println("El precio de la entrada se rebaja a " + precioEntradasConDescuento);
      System.out.println("El dinero recaudado es de " + precioEntradasConDescuento * numeroEntradasVendidas);
   }
   else
   {
   System.out.println("El dinero recaudado es de " + precioEntradas * numeroEntradasVendidas + " Euros");
   }
   
   }
}
