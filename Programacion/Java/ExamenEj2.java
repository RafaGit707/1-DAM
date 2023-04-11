package Java;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExamenEj2 {
     

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int diaAleatorio;
      int mesAleatorio;
      int añoAleatorio;
      
      diaAleatorio = (int)(Math.random() *31);

      mesAleatorio = (int)(Math.random() * 12);
      int mesNombre = mesAleatorio;

      añoAleatorio = (int)(Math.random() * (2100 - 2022) + 2022);

      System.out.println("Es el dia " + diaAleatorio + " del " + mesAleatorio + " de " + añoAleatorio);

      LocalDate fechaAleatoria = LocalDate.of(añoAleatorio, mesAleatorio, diaAleatorio);
      System.out.println(fechaAleatoria);
      
      LocalDate fechaActual = LocalDate.now();

      LocalDate siguienteFinDeAno = fechaActual.withYear(fechaAleatoria.getYear()+1);
      Period deHoyHastaFinDeAno = Period.between(LocalDate.now(), siguienteFinDeAno);
      deHoyHastaFinDeAno.getDays();
      deHoyHastaFinDeAno.getMonths();

      System.out.println("Para el fin de año del año " + añoAleatorio + " quedan: " + deHoyHastaFinDeAno.withDays(diaAleatorio));

      sc.close();
   }
}