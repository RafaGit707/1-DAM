package Java;

public class Ejer15_T5 {
   
   public static void main(String[] args) {
      
      int[] mesas = new int[10];

      boolean salir = false;
      do {

         if (mesas < 4)
      {
         System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
      }

      }

      static void buscarMesa(int[] mesas, int[] personas)
      {
         int mesaLibre = UtilesArrayRafa.buscar(mesas, 0);

         if (mesaLibre >= 0)
         {
            mesas[mesaLibre] = personas;
         }
         else
         {
            for (int i = 0; i < mesas.length; i++)
            {
               boolean huecoEncontrado = false;
               if (!huecoEncontrado && mesas[i] + personas <= 4)
               {
                  huecoEncontrado = true;
                  mesas[i] = mesas[i] + personas <= 4;
               }
            }
         }
      }
   }

}
