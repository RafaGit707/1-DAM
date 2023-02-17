package Java;

import java.util.Scanner;

public class Ejercicio4_45 {
   public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);

   System.out.println("Introduzca el numero de horas trabajadas");
   int horaNormales = sc.nextInt();
   int salario12 = horaNormales * 12;;
   int salario16;
   int horasextras = horaNormales - 40;

   if (horaNormales >= 0 && horaNormales <= 40)
   {
      System.out.println("El sueldo semanal corresponde a " + salario12);
   }
   else if (horaNormales >= 41)
   {
      //horasNormales
      //horasextras --> horas - 40 
      salario16 = horasextras * 16 + (horaNormales - horasextras) * 12;
      System.out.println("El sueldo semanal corresponde a " + salario16);
   }
   else
   {
   System.out.println("Error");
   }
}
}