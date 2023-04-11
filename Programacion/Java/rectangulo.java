package Java;

import java.util.Scanner;

public class rectangulo {

   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

      System.out.println("Altura del rectantgulo");
      int altura = sc.nextInt();

      System.out.println("Anchura del rectantgulo");
      int anchura = sc.nextInt();

      for(int contadorAltura = 0; contadorAltura < altura; contadorAltura++)
      {
         for(int contadorAnchura = 0; contadorAnchura < anchura; contadorAnchura++)
         {
            System.out.print("x");
         }
         //salto de linea
         System.out.println("");
      }
   
   sc.close();
}
}
