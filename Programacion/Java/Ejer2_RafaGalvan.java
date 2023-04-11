package Java;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejer2_RafaGalvan {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int diaAleatorio;
      int añoAleatorio;
      int mesAleatorio;

      mesAleatorio = (int)(Math.random() * 12 + 1);
      
      diaAleatorio = (int)(Math.random() * 31 + 1);

      añoAleatorio = (int)(Math.random() * (2050 - 2023) + 2023);

      //Apartado a)

      System.out.println("Te ha tocado el dia " + diaAleatorio + " del " + mesAleatorio + " de " + añoAleatorio);

      LocalDate fechaAleatoria = LocalDate.of(añoAleatorio,mesAleatorio,diaAleatorio);
      System.out.println(fechaAleatoria);

      //Apartado b)

      LocalDate unoDeEnero = LocalDate.of(añoAleatorio, 1, diaAleatorio);
      Period desdeUnodeEnero = Period.between(LocalDate.of(añoAleatorio,mesAleatorio,diaAleatorio), unoDeEnero);
      desdeUnodeEnero.getDays();
      desdeUnodeEnero.getMonths();

      System.out.println("Ha pasado desde el 1 de Enero de " + añoAleatorio + " : " + desdeUnodeEnero.withDays(diaAleatorio));

      //Apartado c)

      if (diaAleatorio % 2 == 0)
      {
         System.out.println("El dia generado aleatoriamente es par");
      }
      else
      {
         System.out.println("El dia generado aleatoriamente es impar");
      }

      sc.close();

   }

}
