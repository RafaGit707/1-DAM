
import java.util.Scanner;
import java.util.HashMap;

public class exArrayResuelto_RafaGalvan_2 {

static Scanner sc = new Scanner(System.in);
static HashMap<String, Fruta> frutas = new HashMap<>();

public static void main(String[] args) {

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
        opcion = menu();
    } while (!opcion.equals("x"));
}

static String menu()
{
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

static void insertarFruta()
{

    System.out.println("Ingrese el nombre de la fruta:");
    String nombre = sc.nextLine().toLowerCase();

    if (frutas.containsKey(nombre))
    {
        System.out.println("La fruta ya existe en el sistema.");
    }
    else
    {
        Fruta fruta = new Fruta(nombre, 1, 0);
        frutas.put(nombre, fruta);
        System.out.println("Fruta insertada con éxito.");
    }
}

static void añadirCompra()
{
    System.out.println("Ingrese el nombre de la fruta:");
    String nombre = sc.nextLine().toLowerCase();

    if (frutas.containsKey(nombre))
    {
        System.out.println("Ingrese la cantidad vendida de la fruta:");
        int cantidad = sc.nextInt();
        sc.nextLine();
        Fruta fruta = frutas.get(nombre);
        fruta.añadirCompra(cantidad);
        System.out.println("Compra agregada con éxito.");

    }
    else
    {
        System.out.println("La fruta no existe en el sistema.");
    }
}

static void modificarPrecioFruta()
{

    System.out.println("Ingrese el nombre de la fruta:");
    String nombre = sc.nextLine().toLowerCase();

    if (frutas.containsKey(nombre))
    {
        System.out.println("Ingrese el nuevo precio de la fruta:");
        double precio = sc.nextDouble();
        sc.nextLine();
        Fruta fruta = frutas.get(nombre);
        fruta.setPrecio(precio);
        System.out.println("Precio modificado con éxito.");
    }
    else
    {
        System.out.println("La fruta no existe en el sistema.");
    }
}

   static void modificarTodosPrecios()
   {
      System.out.println("Ingrese el nuevo precio de todas las frutas:");
      double precio = sc.nextDouble();
      sc.nextLine();
      for (Fruta fruta : frutas.values())
      {
         fruta.setPrecio(precio);
      }

      System.out.println("Todos los precios han sido modificados con éxito.");
   }
      
   static void mostrarInforme()
   {
      System.out.println("Informe de ventas:");
      System.out.println("--------------------------------------------------");
      System.out.println(String.format("%-15s%-15s%-15s%-15s", "Fruta", "Precio", "Cantidad", "Total"));

      for (Fruta fruta : frutas.values())
      {
         System.out.println(String.format("%-15s%-15.2f%-15d%-15.2f", fruta.getNombre(), fruta.getPrecio(),
         fruta.getCantidad(), fruta.getTotal()));
      }
   }
      


      static class Fruta {
      private String nombre;
      private double precio;
      private int cantidad;
      private double total;
      
      public Fruta(String nombre, double precio, int cantidad)
      {
          this.nombre = nombre;
          this.precio = precio;
          this.cantidad = cantidad;
          this.total = precio * cantidad;
      }
      
      public String getNombre()
      {
          return nombre;
      }
      
      public double getPrecio()
      {
          return precio;
      }
      
      public void setPrecio(double precio)
      {
          this.precio = precio;
          actualizarTotal();
      }
      
      public int getCantidad()
      {
          return cantidad;
      }
      
      public void añadirCompra(int cantidad)
      {
          this.cantidad += cantidad;
          actualizarTotal();
      }
      
      public double getTotal()
      {
          return total;
      }
      
      private void actualizarTotal()
      {
          this.total = precio * cantidad;
      }
   }
      
}
