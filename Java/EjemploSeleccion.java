package Java;

public class EjemploSeleccion {
   public static void main(String[] args) {
      int numero = 12;
      int aleatorio = 0;

      if (numero > 11 && numero %2 == 0)
      {
         System.out.println("Hola - Estoy dentro de un if");
         aleatorio = (int)(Math.random() *100);
         numero = numero + aleatorio;
      }
      else
      {
         System.out.println("Hola - Estoy dentro de un else");
         numero = numero - 1;
      }
      System.out.println("Numero = " + numero + "(" + aleatorio + ")");
   }
}