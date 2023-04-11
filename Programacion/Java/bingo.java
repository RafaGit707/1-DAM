package Java;

import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.TrustManager;

public class bingo {

   static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {

      int[] col0 = new int[3];
      int[] col1 = new int[3];
      int[] col2 = new int[3];
      int[] col3 = new int[3];
      int[] col4 = new int[3];
      int[] col5 = new int[3];
      int[] col6 = new int[3];
      int[] col7 = new int[3];
      int[] col8 = new int[3];

      // int[] col0 = {3, 7, -1};
      // int[] col1 = {-1, 12, 18};
      // int[] col2 = {22, -1, 25};
      // int[] col3 = {-1, 38, -1};
      // int[] col4 = {41, -1, 44};
      // int[] col5 = {52, 57, -1};
      // int[] col6 = {-1, -1, 64};
      // int[] col7 = {-1, 73, 76};
      // int[] col8 = {89, -1, -1};

      int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

      int[] numerosGenerados = new int[0];

      boolean salir = true;

      //System.out.println("Desea sacar un número (1) o Salir (0)");

      do 
      {
         //Crear/restaurar carton vacio y vaciado de los numeros generados en eljuego anterior
         
         //introduzco los numeros de cada columna
         // rellenarNumerosCarton(carton);

         //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
         // ponerBlancos(carton);

         //pinto el cartón ;
         pintarCarton(carton, numerosGenerados);

         //pregunto si quiero sacar otra bola o terminar este juego
         boolean jugar = false;

         // while(jugar)
         // {

         //       //saco numero aleatorio - no se debe repetir
               
         //       //pinto el carton con numeros sacados
         //       int numeroAciertos = pintarCarton(carton, numerosGenerados);


         //       //Eres ganador??
         //       if (numeroAciertos >= 15)
         //       {
         //          System.out.println("-----------------------------");
         //          System.out.println("------------BINGO------------");
         //          System.out.println("-----------------------------");
         //       }

         //       //pregunto si quiero sacar otra bola o terminar este juego
               

            
         // }

         //Pregunto si quiero jugar otro cartón o salir definitivamente del programa
         
         
      } while(!salir);

   }

   static void pintarCarton(int[][] matriz, int[] numerosGenerados)
   {
      for (int i = 0; i < matriz[0].length; i++)
      {
         for(int j = 0; j < matriz.length; j++)
         {
            int columna = i;
            int fila = j;

            System.out.print(matriz[fila][columna] + "\t ");
         }

         System.out.println();
      }

      System.out.println();
   }

   static void rellenarNumerosCarton(int[][] matriz, int[] numerosGenerados)
      {
         for (int i = 0; i < matriz[0].length;)
         {
            int numAleatorios = (int)(Math.random() % 9 + 1 * 10 * 3);

            int columna = numAleatorios;
            int fila = numAleatorios;

            System.out.print(matriz[fila][columna] + "\t ");
         }
      }

      static void ponerBlancos(int[][] matriz, int[] numerosGenerados) 
      {
         for (int i = 0; i < matriz[0].length; i++)
         {
            for(int j = 0; j < matriz.length; j++)
            {
               int numAleatorios = (int)(Math.random() % 9 + 1 * 10 * 3);

               int columna = numAleatorios;
               int fila = numAleatorios;

               System.out.print(matriz[numAleatorios][numAleatorios] + "\t ");

               if (columna != -1)
               {
                  System.out.print(" ");
               }
               else if (fila != -1)
               {
                  System.out.print("a");
               }
            }
         }
      }


}
