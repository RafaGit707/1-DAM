package Java;

import javax.swing.text.Utilities;

public class UtilesArrayRafa {

   static int[] limpiar()
   {
      int[] array = null;

      return array;
   }

   public static void main(String[] args) {
      
      int[] numeros = new int[10];
      numeros = limpiar();
      
   }


}

public class EjercicioArrays {
        
        int[] array = null;

        UtilesArrayRafa.rellenar(10);

        UtilesArrayRafa.imprimir(array);

        array = UtilesArrayRafa.limpiar();

        array = UtilesArrayRafa.insertarAlPrincipio(array, 10);

        array = UtilesArrayRafa.insertarAlPrincipio(array, 20);

        array = UtilesArrayRafa.insertarAlPrincipio(array, 30);

        array = UtilesArrayRafa.insertarAlPrincipio(array, 40);

        array = UtilesArrayRafa.insertarAlFinal(array, 5);

        boolean ordenado = UtilesArrayRafa.estaOrdenado(array);

        System.out.println("Esta ordenado: " + ordenado);

        UtilesArrayRafa.imprimir(array);

        array = UtilesArrayRafa.eliminarPrimero(array);

        array = UtilesArrayRafa.eliminar(array, 40);

        array = UtilesArrayRafa.ordenar(array);

        array = UtilesArrayRafa.insertarOrdenado(array, 15);

        UtilesArrayRafa.imprimir(array);
        
        int posicion30 = UtilesArrayRafa.buscar(array, 30);

        System.out.println("El elemento 30 está en la posicion: " + posicion30);

        int posicion99 = UtilesArrayRafa.buscar(array, 99);

        System.out.println("El elemento 99 está en la posicion: " + posicion99);

        array = UtilesArrayRafa.partirPor(array, 1,3);

        UtilesArrayRafa.imprimir(array);

    }
