import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_RafaGalvan {

   Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {


      String[] frutasArray;
      double[] preciosArray;
      double[] cantidadVendidaArray;
      String opcion = menu();

         do {
             
             switch (opcion) {
                 case "a":
                     insertarFruta();
                     break;
                 case "b":
                     añadirCompra();
                     break;
                 case "c":
                     modificarPrecioFruta();
                     break;
                 case "d":
                     modificarTodosPrecios();
                     break;
                 case "e":
                     mostrarInforme();
                     break;
                 case "x":
                     System.out.println("Saliendo del programa...");
                     break;
                 default:
                     System.out.println("Opción no válida, por favor seleccione una opción válida.");
                     break;
             }
             System.out.println();
         } while (!opcion.equals("x"));
     }
     
     static String menu() {
         System.out.println("a - Insertar fruta");
         System.out.println("b - Añadir compra");
         System.out.println("c - modificar precio fruta");
         System.out.println("d - Modificar todos los precios");
         System.out.println("e - mostrar informe");
         System.out.println("x - salir");
         System.out.println("---------------------------------------------");
         System.out.println(" Indique opción...");
         System.out.println();
         String opcion = sc.nextLine();
         return opcion;
     }
     
     static void insertarFruta() {
         System.out.println("Ingrese el nombre de la fruta:");
         String nombre = sc.nextLine();
         nombre = nombre.toLowerCase();
         if (frutas.containsKey(nombre)) {
             System.out.println("La fruta ya existe en el sistema.");
         } else {
             Fruta fruta = new Fruta(nombre, 1, 0);
             frutas.put(nombre, fruta);
             System.out.println("Fruta insertada con éxito.");
         }
     }
     
     static void añadirCompra() {
         System.out.println("Ingrese el nombre de la fruta:");
         String nombre = sc.nextLine();
         nombre = nombre.toLowerCase();
         if (frutas.containsKey(nombre)) {
             System.out.println("Ingrese la cantidad vendida de la fruta:");
             int cantidad = sc.nextInt();
             sc.nextLine();
             Fruta fruta = frutas.get(nombre);
             fruta.añadirCompra(cantidad);
             System.out.println();
            // faltan cosas aqui y demas opciones
         }
      }
      

}
   