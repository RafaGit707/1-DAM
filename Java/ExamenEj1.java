package Java;
import java.util.Scanner;

public class ExamenEj1 {
   //Dado el siguiente texto:
   //"Crearía un perfume que no sólo fuera humano, sino sobrehumano. Un aroma de ángel, tan indescriptiblemente bueno y pletórico de vigor que quien lo oliera quedaría hechizado
   // y no tendría más remedio que amar a la persona que lo llevara, o sea, amarle a él, Grenouille, con todo su corazón (El Perfume, Patrick Süskind)"
   //Debes:
   //a) Encontrar el caracter que se encuentra en una posición aleatoria. Si es un espacio mostrar espacio.
   //b) Leer un caracter y reemplar todas las apariciones de 'a' por este nuevo caracter.
   //c) Indica al usuario que indique una palabra y busca dicha palabra en el texto.
   // El programa debe indicar si está o no dicha palabra en el texto. Debe de no distinguir entre mayusculas y minúsculas

   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   String cadena = "Crearía un perfume que no sólo fuera humano, sino sobrehumano. Un aroma de ángel, tan indescriptiblemente bueno y pletórico de vigor que quien lo oliera quedaría hechizado y no tendría más remedio que amar a la persona que lo llevara, o sea, amarle a él, Grenouille, con todo su corazón (El Perfume, Patrick Süskind)";
    
            String [] informacion = cadena.split("\\(");

            int posicionRandom = (int) (Math.random() * cadena.length());
            char posicion = cadena.charAt(posicionRandom);
    
            System.out.println("El caracter de la posicion " + posicionRandom + " es: " + posicion);
    
            String [] palabras = cadena.split(" ");
            int numeroPalabras = palabras.length;
            int posicionRandomPalabra = (int) (Math.random() * numeroPalabras);
            String trozo = palabras [posicionRandomPalabra];
            
            System.out.println("La palabra en la posicion " + posicionRandomPalabra + " es: " + trozo );
            
        sc.close();
   }
}