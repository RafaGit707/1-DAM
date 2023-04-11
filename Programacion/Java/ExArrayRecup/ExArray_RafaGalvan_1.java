package ExArrayRecup;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExArray_RafaGalvan_1 {
   public static void main(String[] args) {
        
        // Definimos los nombres de los jugadores
        String[] jugadores = {"Pepe", "Juan", "Sara", "Javi"};
        
        // Creamos la matriz para la tarjeta de golpes
        int[][] tarjetaGolpes = new int[jugadores.length][9];
        
        // Creamos un objeto de la clase Random para generar los golpes aleatorios
        Random random = new Random();
        
        // Pedimos al usuario que pulse una tecla para empezar la partida
        System.out.println("Pulse una tecla para empezar la partida...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        // Recorremos los hoyos
        for (int hoyo = 1; hoyo <= 9; hoyo++)
        {
            
            // Mostramos los golpes de cada jugador en el hoyo anterior
            mostrarTarjetaGolpes(jugadores, tarjetaGolpes, hoyo - 1);
            
            // Pedimos al usuario que pulse una tecla para avanzar al siguiente hoyo
            System.out.println("Pulse una tecla para siguiente hoyo...");
            sc.nextLine();
            
            // Recorremos los jugadores
            for (int jugador = 0; jugador < jugadores.length; jugador++)
            {
                
                // Generamos un número aleatorio entre 1 y 4 que representa los golpes del jugador en el hoyo actual
                int golpes = random.nextInt(4) + 1;
                
                // Actualizamos la matriz de la tarjeta de golpes con los golpes del jugador en el hoyo actual
                tarjetaGolpes[jugador][hoyo - 1] = golpes;
                
                // Mostramos los golpes del jugador en el hoyo actual
                System.out.println(jugadores[jugador] + ": " + golpes + " golpes");
                
            }
            
            // Ordenamos los jugadores y las filas de la matriz de la tarjeta de golpes por el total de golpes realizados hasta el momento
            ordenarTarjetaGolpes(jugadores, tarjetaGolpes, hoyo);
            
        }
        
        // Mostramos los golpes finales de cada jugador
        mostrarTarjetaGolpes(jugadores, tarjetaGolpes, 9);
        sc.close();
    }
    
   // Método para mostrar la tarjeta de golpes de cada jugador en un hoyo determinado
   public static void mostrarTarjetaGolpes(String[] jugadores, int[][] tarjetaGolpes, int hoyo)
   {
      // Mostramos los encabezados de las columnas
      System.out.print("Jugador | ");
      for (int i = 1; i <= 9; i++)
      {
         System.out.print("H" + i + " | ");
      }
      System.out.println("");
      
      // Mostramos la línea divisoria
      System.out.println("====================================================================");
      
      // Mostramos los golpes de cada jugador en el hoyo actual y el total de golpes realizados hasta el momento
      for (int jugador = 0; jugador < jugadores.length; jugador++)
      {
         System.out.print(jugadores[jugador] + " | ");
         int totalGolpes = 0;
         for (int i = 0; i <= hoyo; i++) {
         System.out.print(tarjetaGolpes[jugador][i] + " | ");
         totalGolpes += tarjetaGolpes[jugador][i];
      }
      System.out.print(totalGolpes);
      System.out.println("");
      }
   }

   public static void ordenarTarjetaGolpes(String[] jugadores, int[][] tarjetaGolpes, int hoyo)
   {
      // Creamos un array auxiliar para guardar el total de golpes realizados por cada jugador hasta el momento
    int[] totalGolpes = new int[jugadores.length];
    for (int i = 0; i < jugadores.length; i++)
    {
      int total = 0;
      for (int j = 0; j <= hoyo; j++)
      {
         total += tarjetaGolpes[i][j];
      }
      totalGolpes[i] = total;
   }

    // Ordenamos los arrays jugadores y totalGolpes en función del total de golpes realizados hasta el momento
      for (int i = 0; i < jugadores.length - 1; i++)
      {
         for (int j = i + 1; j < jugadores.length; j++)
         {
            if (totalGolpes[i] > totalGolpes[j])
            {
               // Intercambiamos los valores en el array totalGolpes
               int aux = totalGolpes[i];
               totalGolpes[i] = totalGolpes[j];
               totalGolpes[j] = aux;

               // Intercambiamos las filas correspondientes en la matriz tarjetaGolpes
               int[] auxFila = tarjetaGolpes[i];
               tarjetaGolpes[i] = tarjetaGolpes[j];
               tarjetaGolpes[j] = auxFila;

               // Intercambiamos los valores en el array jugadores
               String auxNombre = jugadores[i];
               jugadores[i] = jugadores[j];
               jugadores[j] = auxNombre;
            }
         }
      }
   }
}
       
