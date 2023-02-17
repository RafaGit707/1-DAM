package Java;

public class Notas {
   public static void main(String[] args) {
      
   int nota = (int)(Math.random() * 10);
   System.out.println("Nota: " + nota);
   if (nota >= 0 && nota < 5)
   {
      System.out.println("Suspenso");
   }
   else if (nota == 7 && nota == 8)
   {
      System.out.println("Notable");
   }
   else if (nota == 9 && nota >= 10)
   {
      System.out.println("Sobresaliente");
   }
   else
   {
   System.out.println("Error");
   }
   }
}
