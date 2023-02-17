public class Ejercicio1_RafaGalvan {
   public static void main(String[] args) {
      
      int[] array = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};
      int max = Integer.min(0, 0);
  
      // Encontrar el número máximo en el array
      for (int i = 0; i < array.length; i++)
      {
          max = Math.max(max, array[i]);
      }
  
      // Reemplaza los números repetidos con el número máximo
      for (int i = 0; i < array.length; i++)
      {
          if (array[i] != max) {
              for (int j = i + 1; j < array.length; j++)
              {
                  if (array[i] == array[j])
                  {
                      array[j] = max + 1;
                      max++;
                  }
              }
          }
      }
  
      // imprimir el array
      for (int i = 0; i < array.length; i++)
      {
          System.out.print(" " + array[i] + " ");
      }
      System.out.println();
  }
    
}
