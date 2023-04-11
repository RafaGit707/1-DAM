
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Ejercicio1 {
   public static void main(String[] args) {

      //Pide al usuario que introduzca su fecha de nacimiento, utilizando 3 preguntas: día, mes y año)

      //Muéstrala en el formato dd-MM-yy
      //Muestra la edad que tienes
      //Indica cuantos días queda para cumplir otro año.

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Introduce tu dia de nacimiento:");
      int diaNacimiento = sc.nextInt();

      System.out.println("Introduce tu mes de nacimiento:");
      int mesNacimiento = sc.nextInt();

      System.out.println("Introduce tu año de nacimiento:");
      int añoNacimiento = sc.nextInt();

      LocalDate miFecha = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
      System.out.println(miFecha);
      
      LocalDate fechaActual = LocalDate.now();

      LocalDate siguienteCumple = miFecha.withYear(fechaActual.getYear()+1);
      Period deHoyHastaMiCumple = Period.between(LocalDate.now(), siguienteCumple);
      deHoyHastaMiCumple.getDays();
      deHoyHastaMiCumple.getMonths();

      System.out.println("Para tu siguiente cumpleaños quedan: " + deHoyHastaMiCumple + " dias");

      sc.close();
   }
}