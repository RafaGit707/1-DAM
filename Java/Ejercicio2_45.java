package Java;

import java.util.Scanner;

public class Ejercicio2_45 {
   public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);

   System.out.println("Dime una hora");
   int hora = sc.nextInt();

   if (hora >= 6 && hora <= 12)
   {
      System.out.println("Buenos dias");
   }
   else if (hora >= 13 && hora <= 20)
   {
      System.out.println("Buenos tardes");
   }
   else if ((hora >= 21 && hora <= 24) || (hora >= 1 && hora <= 5))
   {
      System.out.println("Buenos noches");
   }
   else
   {
   System.out.println("Error");
   }
}
}