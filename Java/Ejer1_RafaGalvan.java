package Java;

import java.util.Scanner;

public class Ejer1_RafaGalvan {
   
   public static void main(String[] args) {
      
   Scanner sc = new Scanner(System.in);

      String cadena = "La libertad, Sancho, es uno de los más preciosos dones que a los hombres dieron los cielos; con ella no pueden igualarse los tesoros que encierra la tierra ni el mar encubre; por la libertad así como por la honra se puede y debe aventurar la vida, y, por el contrario, el cautiverio es el mayor mal que puede venir a los hombres(Don Quijote – Miguel de Cervantes)";
    
      //String [] informacion = cadena.split("\\(");

      //Apartado a)

      int posicionRandom = (int) (Math.random() * cadena.length());
      char posicion = cadena.charAt(posicionRandom);

      System.out.println("El caracter de la posicion " + posicionRandom + " es: " + posicion);

      String [] palabras = cadena.split(" ");
      int numeroPalabras = palabras.length;
      int posicionRandomPalabra = (int) (Math.random() * numeroPalabras);
      String trozo = palabras [posicionRandomPalabra];
      
      System.out.println("La palabra en la posicion " + posicionRandomPalabra + " es: " + trozo );

      //Apartado b)

      System.out.println("Dime un caracter a eliminar");
      String caracterEliminar = sc.nextLine();

      

      System.out.println(cadena);
      
   sc.close();

   }

}
