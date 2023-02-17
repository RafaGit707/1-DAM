package Java;

import java.util.Scanner;

public class Ejercicio2_granja {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Introduce la comida diaria que se compra para los animales");
      int comidaDiaria = sc.nextInt();

      System.out.println("Introduce el numero de animales a alimentar");
      int numAnimales = sc.nextInt();

      System.out.println("Introduce la media de comida que comen los animales");
      int kilosPorAnimal = sc.nextInt();

      int kilosPorAnimalAFalta = kilosPorAnimal;

      if (numAnimales * kilosPorAnimal <= comidaDiaria)
      {
         System.out.println("Disponemos de alimento suficiente para alimentar a todos los animales");
      }
      else if (numAnimales * kilosPorAnimal > comidaDiaria)
      {
         System.out.println("No disponemos de alimento suficiente para alimentar a los animales");
         
         kilosPorAnimal = comidaDiaria / numAnimales;
         System.out.println("A cada animal carresponde " + kilosPorAnimal + " KG");

         comidaDiaria = numAnimales * kilosPorAnimalAFalta;
         System.out.println("Haria falta " + comidaDiaria + " KG de comida diaria");

         if (comidaDiaria < 1)
         {
            System.out.println("No hay na de comida");
            comidaDiaria = numAnimales * kilosPorAnimalAFalta;
            System.out.println("Haria falta " + comidaDiaria + " KG de comida diaria");

         }
      }

   }

}
