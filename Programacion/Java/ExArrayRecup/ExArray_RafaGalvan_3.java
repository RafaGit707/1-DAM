package ExArrayRecup;
import java.util.Scanner;

public class ExArray_RafaGalvan_3 {

   public static void main(String[] args) {
   //Juego del Lingo
   //String palabra secreta ha buscar es : HUECO
   String palabraSecreta = "HUECO";
   char[] arrayCaracteresSecretos = ConvertirStringAArray(palabraSecreta);
   Scanner sc = new Scanner(System.in);
   String intento = "";
   boolean encontrada = false;

   do
   {
   System.out.println("Intento....");
   intento = sc.nextLine();
      if (!intento.equalsIgnoreCase(palabraSecreta))
      {
         String cadenaPistas = comparacion(arrayCaracteresSecretos, intento);
         System.out.println("Pista: " + cadenaPistas);
      }
      else
      {
         encontrada = true;
         System.out.println("Enhorabuena has encotrado la palabra secreta");
      }
   }while(!encontrada);
   sc.close();
   }

   /**
   * Función que devuelve la cadena que se le pasa como parámetro convertida en un array
   de caracteres.
   * @param cadena
   * @return
   */
   public static char[] ConvertirStringAArray(String cadena)
   {
      char[] arrayCaracteres = new char[cadena.length()];
      for (int i = 0; i < cadena.length(); i++)
         {
            arrayCaracteres[i] = cadena.charAt(i);
         }
      return arrayCaracteres;
   }
   /**
   * Funcion que devuelve una cadena de caracteres con la misma longitud que el parámetro
   cadena que se le pasa como parámetro
   * Esta cadena devuelta será de la siguiente forma:
   * '-' Si el caracter que esta en esa posición no está en el array
   * '*' Si el caracter que está en esa posicion esta en algún sitio del array
   * Si el caracter que está en esa posición está en la misma posición del array entonces se
   imprime ese carácter.
   * @param array
   * @param cadena
   * @return
   */
   public static String comparacion(char[] array, String cadena)
   {
      StringBuilder pista = new StringBuilder(cadena.length());

      for (int i = 0; i < cadena.length(); i++)
      {
         if (array[i] == cadena.charAt(i))
         {
            pista.append(array[i]);
         }
         else if (cadena.indexOf(array[i]) != -1)
         {
            pista.append('*');
         }
         else
         {
            pista.append('-');
         }
      }
      return pista.toString();
   
   }
}
