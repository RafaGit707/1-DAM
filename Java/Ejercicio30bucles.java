package Java;

import java.util.Scanner;

public class Ejercicio30bucles {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("!");

      int primerDia = 0;
      int segundoDia = 0;
      int primeraHora = 0;
      int segundaHora = 0;
      String primerDiaString;
      String segundoDiaString;
      String nombrePrimerDia = "";
      String nombreSegundoDia = "";
      boolean datosCorrectos = true;
  
      // Recogida de datos ////////////////////////////////////////////
  
      do {
        System.out.println("\nPor favor, introduzca la primera hora.");
  
        boolean diaCorrecto;
  
        // Primer día /////////////////////////////////////////////////
        do {
  
          diaCorrecto = true;
  
          System.out.print("Día: ");
          primerDiaString = System.console().readLine();
  
          switch (primerDiaString) {
            case "lunes":
            case "1":
              primerDia = 1;
              nombrePrimerDia = "lunes";
              break;
            case "martes":
            case "2":
              primerDia = 2;
              nombrePrimerDia = "martes";
              break;
            case "miércoles":
            case "3":
              primerDia = 3;
              nombrePrimerDia = "miercoles";
              break;
            case "jueves":
            case "4":
              primerDia = 4;
              nombrePrimerDia = "jueves";
              break;
            case "viernes":
            case "5":
              primerDia = 5;
              nombrePrimerDia = "viernes";
              break;
            case "sábado":
            case "6":
              primerDia = 6;
              nombrePrimerDia = "sábado";
              break;
            case "domingo":
            case "7":
              primerDia = 7;
              nombrePrimerDia = "domingo";
              break;
            default:
              diaCorrecto = false;
          }
  
          if (!diaCorrecto) {
            System.out.println("No se ha introducido correctamente el día de la semana.");
            System.out.print("Los días válidos son: lunes, martes, miércoles, ");
            System.out.println("jueves, viernes, sábado y domingo.");
          }
  
        } while (!diaCorrecto);
  
        // Primera hora ///////////////////////////////////////////////
  
        boolean horaCorrecta;
  
        do {
          horaCorrecta = true;
          System.out.print("Hora: ");
          primeraHora = Integer.parseInt(System.console().readLine());
          if ((primeraHora < 0) || (primeraHora > 23)) {
            System.out.println("No se ha introducido correctamente la hora del día.");
            System.out.println("Las horas válidas están entre 0 y 23.");
            horaCorrecta = false;
          }
        } while (!horaCorrecta);
  
        System.out.println("Por favor, introduzca la segunda hora.");
  
        // Segundo día ////////////////////////////////////////////////
        do {
  
          datosCorrectos = true;
  
          diaCorrecto = true;
  
          System.out.print("Día: ");
          segundoDiaString = System.console().readLine();
  
          switch (segundoDiaString) {
            case "lunes":
            case "1":
              segundoDia = 1;
              nombreSegundoDia = "lunes";
              break;
            case "martes":
            case "2":
              segundoDia = 2;
              nombreSegundoDia = "martes";
              break;
            case "miércoles":
            case "3":
              segundoDia = 3;
              nombreSegundoDia = "miércoles";
              break;
            case "jueves":
            case "4":
              segundoDia = 4;
              nombreSegundoDia = "jueves";
              break;
            case "viernes":
            case "5":
              segundoDia = 5;
              nombreSegundoDia = "viernes";
              break;
            case "sábado":
            case "6":
              segundoDia = 6;
              nombreSegundoDia = "sábado";
              break;
            case "domingo":
            case "7":
              segundoDia = 7;
              nombreSegundoDia = "domingo";
              break;
            default:
              segundoDia = 0;
          }
  
          if (!diaCorrecto) {
            System.out.println("No se ha introducido correctamente el día de la semana.");
            System.out.print("Los días válidos son: lunes, martes, miércoles, ");
            System.out.println("jueves, viernes, sábado y domingo.");
          }
  
        } while (!diaCorrecto);
  
        // Comprueba que el segundo día sea posterior al primero //////
        if (segundoDia <= primerDia) {
          System.out.println("El segundo día debe ser posterior al primero.");
          datosCorrectos = false;
        }
  
        // Segunda hora ///////////////////////////////////////////////
        if (datosCorrectos) {
          do {
            horaCorrecta = true;
            System.out.print("Hora: ");
            segundaHora = Integer.parseInt(System.console().readLine());
            if ((segundaHora < 0) || (segundaHora > 23)) {
              System.out.println("No se ha introducido correctamente la hora del día.");
              System.out.println("Las horas válidas están entre 0 y 23.");
              horaCorrecta = false;
            }
          } while (!horaCorrecta);
  
        }
  
      } while (!datosCorrectos);
      // Fin de la recogida de datos //////////////////////////////////
  
      System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
      System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
      System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " hora/s.");

   }

}
