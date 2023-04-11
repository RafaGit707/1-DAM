package Java;

import java.util.Scanner;

public class menuFuncionesBasicas {

   static boolean esCapicua(int numero) {

      Scanner sc = new Scanner(System.in);
      
      String opcion = sc.nextLine();

      int operador1;

      switch(opcion)
      {



      }
   }
      static int siguientePrimo(int numero)
      {
         int resultado = numero + 1;

         boolean encontrado = false;
         while (!encontrado)
         {
            if(esPrimo(resultado))
            {
               encontrado = true;
            }
            else
            {
               resultado++;
            }
         }
         return resultado;
      }

      static int potencia(int base, int exponente)
      {
         int resultado = base;
         if (exponente ==0)
         {
            resultado = 1;
         }
         else
         {
            for(int aux = 1; aux <=exponente; aux++
            {
               resultado = resultado * base;
            }
         }
      }

   }