package Java;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
   
   public static void main(String[] args) {

      int NumeroSecreto = (int)(Math.random() * 100) + 1;
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Trata de adivinar el numero secreto (-1 para rendirse)");

      int intento = sc.nextInt();
      boolean encontrado = false;

      while (intento != -1 && !encontrado)
      {
         if (intento < NumeroSecreto)
         {
            System.out.println("El numero secreto es mayor");
         }
         if (intento > NumeroSecreto)
         {
            System.out.println("El numero secreto es menor");
         }
         if (intento == NumeroSecreto)
         {
            encontrado = true;
         }
         if (!encontrado)
         {
            System.out.println("Intentalo otra vez");
            intento = sc.nextInt();
         }
         if (encontrado)
         {
            System.out.println("Enhorabuena lo has encontrado");
         }
      }

      
      sc.close();

   }

}
