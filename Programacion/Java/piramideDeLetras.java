package Java;

import java.util.Scanner;

public class piramideDeLetras {
  
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Dime la altura de la piramide: ");
      int alturaPiramide = sc.nextInt();

      //Limpia bufer
      sc.nextLine();

      System.out.println("Dime el caracter inicial: ");
      char caracterInicial = sc.nextLine().toUpperCase().charAt(0);

      for (int altura = 1; altura <= alturaPiramide; altura++)
      {

      for (int aux = 0; aux < altura; aux++)
      {
         int codigoCaracterInicial = (int)caracterInicial + aux;
         int numero = codigoCaracterInicial - 65;
         int posicionNumero = numero % 25;
         int nuevoCodigo = posicionNumero + 65;
         char nuevoCaracter = (char)nuevoCodigo;
         System.out.print(nuevoCaracter);
      }
      System.out.println();

      }

   }

}
