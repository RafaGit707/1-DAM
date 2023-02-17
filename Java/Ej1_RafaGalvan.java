package Java;

import java.util.Scanner;

public class Ej1_RafaGalvan {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      boolean salir = false;

   String frase = "";

   do 
   {
      //Imprimimos el menu
      System.out.println("a - Introducir una cadena de caracteres (elimina la frase que hubiera y almacena la nueva)");
      System.out.println("b - Mostrar la frase actual");
      System.out.println("c - Borrar la frase");
      System.out.println("d - Pregunta por una cadena de caracteres y devuelve el número de apariciones de dicha cadena en la frase almacenada y las posiciones que ocupa en la frase. (debe encontrar tanto si coincide en mayúsculas como en minúsculas)");
      System.out.println("e - Recorrer cada una de la palabras de la cadena principal en orden inverso y devolver por cada palabra: Si posición + la palabra + longitud la palabra.");
      System.out.println("f - Salir");

      System.out.println("Indica una opción: ");
      char opcion = sc.nextLine().toLowerCase().charAt(0);

      switch (opcion)
      {
            case 'a':

               //Añade a la frase una cadena y elimina la frase.

               System.out.println("Dime la nueva frase...");
               String fraseNueva = sc.nextLine();
               frase = (frase = " " + " " + fraseNueva).trim();
               break;

            case 'b':

               //Mostrar cadena actual

               if (frase.equals(""))
               {
                  System.out.println("La frase está vacia");
               }
               else
               {
                  System.out.println("La frase actual es: " + frase);
               }
               break;

            case 'c':

               

               break;

            case 'd':

               //Busca caracteres y dice cuantas veces aparece y la posicion

               System.out.println("Indica el caracter que quieres buscar...");
               char caracteresBuscados =  sc.nextLine().charAt(0);
               String fraseMinuscula = frase.toLowerCase();

               int numApariciones = 0;
               String posicionesDondeAparece = "";

               for(int aux = 0; aux < fraseMinuscula.length(); aux++)
               {
                  char caracterFrase = fraseMinuscula.charAt(aux);

                  if(caracteresBuscados == caracterFrase)
                  {
                     numApariciones++;
                     posicionesDondeAparece += aux + " ";
                  }
               }

               System.out.println("El caracter: " + caracteresBuscados + " aparece " + numApariciones + " veces");
               System.out.println("En las posiciones: " + posicionesDondeAparece);

               break;
            
            case 'e':

         

               break;

            case 'f':

               salir = true;
               break;

            default:
      }

      System.out.println("Pulse ENTER para continuar");
      sc.nextLine();

   }  while (salir == false);

   sc.close();
   
   }

}
