import java.util.Random;

public class Ejercicio3_RafaGalvan {
   
   public static void main(String[] args) {

      int[][] matriz = new int[5][10];
      Random aleatorio = new Random();

      // Llena la matriz con números aleatorios entre 0 y 4
      for (int i = 0; i < 5; i++)
      {
            for (int j = 0; j < 10; j++)
            {
               matriz[i][j] = aleatorio.nextInt(5);
            }
      }

      // Recorre cada fila y verifica si suma 24
      for (int i = 0; i < 5; i++)
      {
            int sumaFila = 0;
            int cantCeros = 0;
            for (int j = 0; j < 10; j++)
            {
               sumaFila += matriz[i][j];

               if (matriz[i][j] == 0)
               {
                  cantCeros++;
               }
            }
            if (sumaFila < 24)
            {
               int diferencia = 24 - sumaFila;

               if (cantCeros > 0)
               {
                  int sumaCero = diferencia / cantCeros;
                  int sobrante = diferencia % cantCeros;

                  for (int j = 0; j < 10; j++)
                  {
                        if (matriz[i][j] == 0)
                        {
                           matriz[i][j] = sumaCero;

                           if (sobrante > 0)
                           {
                              matriz[i][j]++;
                              sobrante--;
                           }
                        }
                  }
               } else {
                  for (int j = 0; j < 10; j++)
                  {
                        if (diferencia > 0)
                        {
                           matriz[i][j] = -1;
                           diferencia--;
                        }
                  }
               }
            }
      }

      // Imprime la matriz
      for (int i = 0; i < 5; i++)
      {
            for (int j = 0; j < 10; j++)
            {
               System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
      }

      // Imprime sumas de filas y columnas
      System.out.println("Suma de filas: ");
      for (int i = 0; i < 5; i++)
      {
            int sumaFila = 0;
            for (int j = 0; j < 10; j++)
            {
               sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
      }

      System.out.println("Suma de columnas: ");
      for (int i = 0; i < 10; i++)
      {
            int sumaColumna = 0;
            for (int j = 0; j < 5; j++)
            {
               sumaColumna += matriz[j][i];
            }
            System.out.println("Columna " + (i + 1) + ": " + sumaColumna);
      }
   }

}
