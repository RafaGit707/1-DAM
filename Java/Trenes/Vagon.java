package Trenes;

public class Vagon {

   private static int contadorVagones = 1;
   private final int id;
   private final int cargaMaxima;
   private int cargaActual;
   private final String tipoMercancia;
   
   public Vagon(int cargaMaxima,int cargaActual, String tipoMercancia) {
       this.id = contadorVagones++;
       this.cargaMaxima = cargaMaxima;
       this.cargaActual = cargaActual;
       this.tipoMercancia = tipoMercancia;
   }

   
   public int getId() {
       return id;
   }
   
   public int getCargaMaxima() {
       return cargaMaxima;
   }
   
   public int getCargaActual() {
       return cargaActual;
   }
   
   public String getTipoMercancia() {
       return tipoMercancia;
   }
   
   public boolean enganchar() {
       if (cargaActual + cargaMaxima > 0) {
           return false;
       }
       cargaActual += cargaMaxima;
       return true;
   }
   
   public boolean desenganchar() {
       if (cargaActual == 0) {
           return false;
       }
       cargaActual -= cargaMaxima;
       return true;
   }
   
   @Override
   public String toString() {
       return "V" + id + " - " + cargaActual + "kgs de " + cargaMaxima + " " + tipoMercancia;
   }
}
