package Java;

public class Ej4_T5 {
   
   int [] numero =
   int [] cuadrado = 
   int [] cubo = 

   rellenarConAleatorios(numero);
   
   System.out.println(Arrays.toString(numero));
   
   static void rellenarConAleatorios (int[] arrayOrigen, int[] arrayDestino)
   {
      for (int i = 0; i < arrayOrigen.length; i++)
      {
         int aleatorio = (int)(Math.random()*101);
         arrayOrigen[i] = aleatorio;
      }
   }

   static void rellenarConElCuadrado (int[] arrayOrigen, int[] arrayDestino)
   {
      for (int i = 0; i < arrayDestino.length; i++)
      {
         int valor = arrayOrigen[i];
         int nuevoValor = (int)(Math.pow(valor, 2));
         arrayDestino[i] = nuevoValor;
      }
   }

   static void rellenarConElCubo (int[] arrayOrigen, int[] arrayDestino)
   {
      for (int i = 0; i < arrayDestino.length; i++)
      {
         int valor = arrayOrigen[i];
         int nuevoValor = (int)(Math.pow(valor, 2));
         arrayDestino[i] = nuevoValor;
      }
   }

   static void rellenarConExponente (int[] arrayOrigen, int[] arrayDestino, int exponente)
   {
      for (int i = 0; i < arrayDestino.length; i++)
      {
         int valor = arrayOrigen[i];
         int nuevoValor = (int)(Math.pow(valor, exponente));
         arrayDestino[i] = nuevoValor;
      }
   }

   static void imprimir (int[] array1, int[] array2, int[] array3)
   {
      for (int i = 0; i < array.length; i++)
      {
         System.out.println(array1[i]);
      }
   }
   
}
