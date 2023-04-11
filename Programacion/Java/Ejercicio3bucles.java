package Java;

public class Ejercicio3bucles {
   
   public static void main(String[] args) {
      
   int condicion = 0;

   System.out.println("Los multiplos de 5 son: ");

   do {
      if (condicion % 5 == 0)
      {
         System.out.println(condicion);
      }
      condicion++;
   } while (condicion > 0 && condicion < 100);

}
}
