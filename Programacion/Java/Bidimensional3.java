package Java;

import java.util.Arrays;

public class Bidimensional3 {
   
   public static void main(String[] args) {
      
      int [][] matriz = new int [4][5];

      rellenarTabla(matriz);

      imprimirConSumatorios(matriz);

      int [] arrayNumeros = new int[100];

      static void imprimirArrays (int[] arrayBid, int[] fila)
      {
         for (int i = 0; i < arrayBid.length; i++)
         {
            for (int j = 0; j < fila.length; j++)
            {
               int aleatorio = (int)Math.random()*10+1;
               fila[j] = aleatorio;
            }
         }
      }

      static void imprimirConSumatorios(int[][] arrayBid)
      {
         System.out.println(Arrays.deepToString(arrayBid));
         System.out.println(); //salto de linea

         int sumaFila = 0;

         for (int i = 0; i < arrayBid.length; i++)
         {
            int[] fila = arrayBid[i];
            sumaFila = 0;

            for (int j = 0; j < fila.length; j++)
            {
               System.out.println(arrayBid[i][j] + "\t");
               sumaFila += fila[j];
            }
            System.out.println();
         }

         System.out.println("-------------------------------------------------");

         int sumaTotalColumna = 0;

         int sumaColumna = 0;

         for (int i = 0; i < arrayBid[0].length; i++)
         {
            sumaColumna += arrayBid[j][i];
         }
         System.out.println(sumaColumna + "\t");
         sumaTotalColumna += sumaColumna;

      }
      sumaTotal += sumaTotalColumna;

      System.out.println("  |  " + sumaTotal);

   }

}
