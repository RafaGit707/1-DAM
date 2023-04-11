package Java;

import java.util.Scanner;

public class Ejercicio3_RafaGalvan {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      boolean salir = false;

   String frase = "";

   do 
   {
      //Imprimimos el menu
      System.out.println("a - Introducir una cadena de caracteres (elimina la frase que hubiera y almacena la nueva");
      System.out.println("b - Mostrar la cadena actual");
      System.out.println("c - Pregunta por una cadena de caracteres y devuelve el número de apariciones de dicha cadena en la cadena principal y las posiciones que ocupa en la cadena principal. (debe encontrar tanto si coincide en mayúsculas como en minúsculas)");
      System.out.println("d - Recorrer cada una de la palabras de la cadena principal en orden inverso y devolver por cada palabra: Si posición + la palabra + longitud la palabra.");
      System.out.println("e - Invertir las palabras de la cadena principal utilizando un bucle.");
      System.out.println("f - Salir");

      System.out.println("Indica una opción:....");
      char opcion = sc.nextLine().toLowerCase().charAt(0);

      switch (opcion)
      {
            case 'a':

               //Añadir a la frase una cadena y eliminar la frase.

               System.out.println("Dime la nueva frase...");
               String fraseNueva = sc.nextLine();
               frase = (frase = " " + " " + fraseNueva).trim();
               break;

            case 'b':

               //Mostrar la frase

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

               //Mostrar el numero de palabras

               String[] palabras = frase.trim().split(" ");
               int numeroPalabras = palabras.length;
               System.out.println("La frase tiene " + numeroPalabras + " palabras");
               break;

               case 'd':

               //Buscar caracter y decir cuantas veces aparece y donde

               System.out.println("Indica el caracter que quieres buscar...");
               char caracterBuscado =  sc.nextLine().charAt(0);
               String fraseMinuscula = frase.toLowerCase();

               int numApariciones = 0;
               String posicionesDondeAparece = "";

               for(int aux = 0; aux< fraseMinuscula.length(); aux++)
               {
                  char caracterFrase = fraseMinuscula.charAt(aux);

                  if(caracterBuscado == caracterFrase)
                  {
                     numApariciones++;
                     posicionesDondeAparece += aux + " ";
                  }
               }

               System.out.println("El caracter :" + caracterBuscado + " aparece " + numApariciones);
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

   }

}
