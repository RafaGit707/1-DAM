package Java;

import java.util.Scanner;

public class FrasePalindroma {
   
   public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    String frase = "";

    do {
      
      System.out.println("Introduzca la frase: ");
      frase = sc.nextLine();

      frase = frase.replace(" ", "");

      int apuntadorInicio = 0;
      int apuntadorFinal = frase.length()-1;

      boolean esPalindromoOpcion1 = true;

      while (apuntadorInicio <= apuntadorFinal)
      {
         if (frase.charAt(apuntadorInicio) != frase.charAt(apuntadorFinal))
         {
            esPalindromoOpcion1 = false;
         }
         apuntadorFinal--;
         apuntadorInicio++;
      }

      String fraseInvertida = "";
      for (int apuntador = frase.length()-1; apuntador >= 0; apuntador--)
      {
         char caracterApuntado = frase.charAt(apuntador);
         fraseInvertida = fraseInvertida + caracterApuntado;
      }

      boolean esPalindromo = frase.equals(fraseInvertida);

      if (esPalindromoOpcion1)
      {
         System.out.println("Son palindromas");
      }

      else
      {
         System.out.println("No lo son");
      }

      System.out.println("\n----------------------------------------------------- \n");

    } while (!frase.toUpperCase().equals("Salir"));

   }

}
