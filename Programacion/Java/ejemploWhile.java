package Java;

import java.util.Scanner;

public class ejemploWhile {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Introduzca una letra (s para terminar)");
      String condicion = sc.nextLine();

      while (!condicion.equals("s"))
      {
         System.out.println("Has escrito" + condicion);

         condicion = sc.nextLine();
         System.out.println("Introduzca una letra para terminar");
      }

   }
   
}
