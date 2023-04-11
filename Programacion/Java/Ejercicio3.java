import java.util.Scanner;

public class Ejercicio3 {
    
    //Mostrar la información del libro sabiendo que aparece despues del simbolo '(' : "Libro: Cien años de soledad. G. García Márquez"
    //Busca un número random entre 0 y el número total de caracters  y muestralo por pantalla. El caracter en la posicion X es: Trocea
    //el texto en palabras y devuelve la palabra que esté en la posición que indique un número aleatorio entre 0 y el número de palabras. La palabraen la posición x es: XXXX
    //Preguntar ¿Como se llamaba el coronel? y si responde su nombre o su apellido o ambos, sin tener en cuenta las mayúsculas/minúsculas) indicar que se ha acertado la pregunta.
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            String cadena = "Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. (Cien años de soledad. G. García Márquez).";
    
            String [] informacion = cadena.split("\\(");
            String informacionLibro = informacion [1];
    
            System.out.println("(" + informacionLibro);

            int posicionRandom = (int) (Math.random() * cadena.length());
            char posicion = cadena.charAt(posicionRandom);
    
            System.out.println("El caracter de la posicion " + posicionRandom + " es: " + posicion);
    
            String [] palabras = cadena.split(" ");
            int numeroPalabras = palabras.length;
            int posicionRandomPalabra = (int) (Math.random() * numeroPalabras);
            String trozo = palabras [posicionRandomPalabra];
            
            System.out.println("La palabra en la posicion " + posicionRandomPalabra + " es: " + trozo );
    
            System.out.println("¿Como se llamaba el coronel?");
            String nombreApellido = sc.nextLine();
    
            System.out.println((nombreApellido.compareToIgnoreCase("Aurelio Buendia") == 0) || (nombreApellido.compareToIgnoreCase("Aurelio") == 0) 
            || (nombreApellido.compareToIgnoreCase("Buendia") == 0)
             ? "Ha acertado la pregunta" : "Ha fallado la pregunta");
            
        sc.close();
    }
}