package ExArrayRecup;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExArray_RafaGalvan_2 {

   public static void main(String[] args)
   {
      int[] numeros = generarNumeros();
      System.out.println("Vector generado: " + Arrays.toString(numeros));
      
      int posicion = leerPosicion(numeros.length);
      int pivote = numeros[posicion - 1];
      
      int sumaIzquierda = calcularSumaIzquierda(numeros, posicion);
      int sumaDerecha = calcularSumaDerecha(numeros, posicion);
      int mayoresIzquierda = contarMayores(numeros, posicion, true);
      int menoresIzquierda = posicion - 1 - mayoresIzquierda;
      int mayoresDerecha = contarMayores(numeros, posicion, false);
      int menoresDerecha = numeros.length - posicion - mayoresDerecha;
      
      System.out.println("Elemento: " + pivote);
      System.out.println("A: Suma a Izquierda: " + sumaIzquierda);
      System.out.println("B: Suma a derecha: " + sumaDerecha);
      System.out.println("C: A la Izquierda -> Mayores: " + mayoresIzquierda + " Menores: " + menoresIzquierda);
      System.out.println("D: A la Derecha -> Mayores: " + mayoresDerecha + " Menores: " + menoresDerecha);
   }
          
      public static int[] generarNumeros()
      {
         Random random = new Random();
         int[] numeros = new int[20];
         boolean[] usados = new boolean[41]; // 41 posibles valores (-20 a 20)
         int usadosCount = 0;
         
         while (usadosCount < 20)
         {
            int numero = random.nextInt(41) - 20; // números entre -20 y 20
            if (!usados[numero + 20])
            { // si no ha sido usado
                  numeros[usadosCount] = numero;
                  usados[numero + 20] = true;
                  usadosCount++;
            }
         }
         
         return numeros;
      }
          
      public static int leerPosicion(int maximo)
      {
         Scanner sc = new Scanner(System.in);
         int posicion;
         
         do {
            System.out.print("Indique una posición entre 1 y " + maximo + ": ");
            posicion = sc.nextInt();
         } while (posicion < 1 || posicion > maximo);
         sc.close();
         return posicion;
      }
      
      public static int calcularSumaIzquierda(int[] numeros, int posicion)
      {
         int suma = 0;
         for (int i = 0; i < posicion - 1; i++)
         {
            suma += numeros[i];
         }
         return suma;
      }
      
      public static int calcularSumaDerecha(int[] numeros, int posicion)
      {
         int suma = 0;
         for (int i = posicion; i < numeros.length; i++)
         {
            suma += numeros[i];
         }
         return suma;
      }
      
      public static int contarMayores(int[] numeros, int posicion, boolean izquierda)
      {
      int contador = 0;
      int pivote = numeros[posicion - 1];
      for (int i = 0; i < numeros.length; i++)
      {
            if (i == posicion - 1)
            {
               continue; // saltar el elemento de pivote
            }
            if ((izquierda && i < posicion - 1) || (!izquierda && i > posicion - 1))
            {
               if (numeros[i] > pivote)
               {
                  contador++;
               }
            }
      }
      return contador;
      }
}
