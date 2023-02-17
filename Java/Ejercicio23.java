package Java;

import java.util.Scanner;

public class Ejercicio23 {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Introduzca la base imponible: ");
      float baseImponible = sc.nextFloat();

      sc.nextLine();
      System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
      String tipoIva = sc.nextLine();

      System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5, 5porc): ");
      String codigoPromocional = sc.nextLine();

      float porcentajeIva = 21;
      float descuento = 0;
      float precioTotal = 0;
      float precioTotalConDescuento = 0;

      switch (tipoIva)
      {
         case "general":
         porcentajeIva = 21;
         break;

         case "reducido":
         porcentajeIva = 10;
         break;

         case "superreducido":
         porcentajeIva = 4;
         break;

         default:
         porcentajeIva = 21;
         break;

      }
      float importeIva = (baseImponible * (porcentajeIva/100.0f));
      precioTotal = baseImponible + importeIva;

      if (codigoPromocional.equals("mitad"))
      {
         descuento = precioTotal / 2;
      }
      else if (codigoPromocional.equals("meno5"))
      {
         descuento = precioTotal - 5;
      }
      else if (codigoPromocional.equals("5porc"))
      {
         descuento = precioTotal * (0.05f);
      }

      precioTotalConDescuento = precioTotal - descuento;

      System.out.printf("Base imponible \t%.2f \n", baseImponible);
      System.out.printf("IVA (%s) \t%.2f \n", porcentajeIva, importeIva);
      System.out.printf("Precio con IVA \t%.2f \n", precioTotal);

      if (descuento > 0)
      {
         System.out.printf("Codigo Descuento (%s) \t%.2f \n", codigoPromocional, - descuento);
      }

      System.out.printf("Total \t%.2f \n", precioTotalConDescuento);
   }

}
