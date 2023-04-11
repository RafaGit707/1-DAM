package Java;

import java.util.Scanner;

public class Ej2_RafaGalvan {

   static int nivelAgua = 0;
   static int[] ultimosMovimientos = new int[3];
   static int aux = 0;2
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("1) Litros actuales");
         System.out.println("2) Añadir cantidad");
         System.out.println("3) Quitar cantidad");
         System.out.println("0) Salir");
         System.out.print("Selecciona una opción: ");
         int opcion = sc.nextInt();
         switch (opcion) {
               case 1:
                  printNivelAgua();
                  break;
               case 2:
                  System.out.print("Introduce la cantidad a añadir: ");
                  int aguaAñadir = sc.nextInt();
                  añadirAgua(aguaAñadir);
                  break;
               case 3:
                  System.out.print("Introduce la cantidad a quitar: ");
                  int aguaQuitar = sc.nextInt();
                  quitarAgua(aguaQuitar);
                  break;
               case 0:
                  System.out.println("Saliendo...");
                  return;
               default:
                  System.out.println("Opción no válida");
                  break;
         }
      }
   }

      static void printNivelAgua()
      {
         String mensajeNivel = "";
         
         if (nivelAgua <= 100)
         {
         mensajeNivel = "Nivel Bajo";
         }
         else if (nivelAgua <= 299)
         {
         mensajeNivel = "Nivel preocupante";
         }
         else if (nivelAgua <= 599)
         {
         mensajeNivel = "Nivel Medio";
         }
         else if (nivelAgua <= 799)
         {
         mensajeNivel = "Nivel Bueno";
         }
         else if (nivelAgua <= 999)
         {
         mensajeNivel = "Nivel lleno";
         }
         else
         {
         mensajeNivel = "DESBORDE";
         }

         System.out.print("Litros: " + nivelAgua + " - " + mensajeNivel + " - ");

         for (int i = 0; i < 3; i++)
         {
            System.out.print(ultimosMovimientos[i] + "/");
         }
         System.out.println();
      }

      static void añadirAgua(int aguaAñadir)
      {
         if (nivelAgua + aguaAñadir > 1000)
         {
            System.out.println("DESBORDE");
            return;
         }
         if (nivelAgua > 800 && ultimosMovimientos[0] > 50 && ultimosMovimientos[1] > 50 && ultimosMovimientos[2] > 50)
         {
            nivelAgua -= 100;
            System.out.println("Por seguridad se desaguan 100 litros");
            añadirAgua(aguaAñadir);
            return;
         }
         ultimosMovimientos[aux] = aguaAñadir;

         aux = (aux + 1) % 3;

         nivelAgua += aguaAñadir;

         printNivelAgua();
      }

   static void quitarAgua(int aguaQuitar)
   {
      if (nivelAgua - aguaQuitar < 0)
      {
         System.out.println("No se pueden quitar más litros");
         return;
      }
      ultimosMovimientos[aux] = -aguaQuitar;
      aux = (aux + 1) % 3;
      nivelAgua -= aguaQuitar;
      printNivelAgua();

   }

}
