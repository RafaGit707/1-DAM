package Java;

import java.util.Scanner;

public class Ejercicio7bucles {

   public static void main(String[] args) {

   int intento = 4;
   
   int contraseña = 1234;
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce la combinacion para abrir la caja fuerte (-1 para rendirse)");
      int numero = sc.nextInt();

      boolean encontrado = false;

      do {

      intento--;

      if (numero > 0)
      {
         if (numero < contraseña)
         {
            System.out.println("El numero secreto es mayor");
         }
         if (numero > contraseña)
         {
            System.out.println("El numero secreto es menor");
         }
         if (intento == contraseña)
         {
            encontrado = true;
         }
         if (!encontrado)
         {
            System.out.println("Intentalo otra vez");
            numero = sc.nextInt();
         }
         if (encontrado)
         {
            System.out.println("Enhorabuena lo has encontrado");
         }
      }
      else (intento <= 0)
      {
         System.out.println("Lo siento, se te han acabado los intentos");

      }
         
      } while (numero != -1 && !encontrado);

      
      sc.close();

   }
}