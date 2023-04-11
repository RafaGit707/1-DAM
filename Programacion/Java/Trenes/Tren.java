package Trenes;

import java.util.ArrayList;

class Tren {

   private Locomotora locomotora;
   private Maquinista maquinista;
   private ArrayList<Vagon> vagones;

   public Tren(Locomotora locomotora, Maquinista maquinista) {
       this.locomotora = locomotora;
       this.maquinista = maquinista;
       this.vagones = new ArrayList<>();
   }

   public Locomotora getLocomotora() {
       return locomotora;
   }

   public Maquinista getMaquinista() {
       return maquinista;
   }

   public ArrayList<Vagon> getVagones() {
       return vagones;
   }

   public void enganchaVagon(int cargaMaxima, int cargaActual, String tipoMercancia) {
      if (vagones.size() >= 5) {
         Vagon vagon = new Vagon(cargaMaxima, cargaActual, tipoMercancia);
         vagones.add(vagon);
          System.out.println("No se puede enganchar más vagones. El tren ya tiene el máximo de vagones.");
          return;
      }

      if (cargaActual > cargaMaxima) {
         Vagon vagon = new Vagon(cargaMaxima, cargaActual, tipoMercancia);
         vagones.add(vagon);
          System.out.println("No se puede enganchar el vagon " + vagon.getId() + ". La carga actual es mayor que la carga máxima.");
          return;
      }
      else {
      Vagon vagon = new Vagon(cargaMaxima, cargaActual, tipoMercancia);
      vagones.add(vagon);
      System.out.println("Se ha enganchado el vagon " + vagon.getId() + " al tren.");
      }
  }

  public void desenganchaVagon() {
      if (vagones.isEmpty()) {
          System.out.println("No hay vagones que desenganchar. El tren ya no tiene vagones.");
          return;
      }

      Vagon vagon = vagones.remove(vagones.size() - 1);
      System.out.println("Se ha desenganchado el vagon " + vagon.getId() + " del tren.");
  }

  public void muestraInformacion() {
      StringBuilder sb = new StringBuilder();
      sb.append("Locomotora: " + locomotora.getMatricula() + " (" + locomotora.getPotencia() + "Cv) - [");

      for (int i = 0; i < vagones.size(); i++) {
          Vagon vagon = vagones.get(i);
          sb.append("Vagon " + vagon.getId() + " - " + vagon.getCargaActual() + "kgs de " + vagon.getCargaMaxima() + " kgs de carga maxima " + vagon.getTipoMercancia());
          if (i != vagones.size() - 1) {
              sb.append("] - [");
          }
      }

      sb.append("] = " + getCargaTotal() + "kgs de Carga total - " + maquinista.getNombre() + " (" + maquinista.getRango() + ")");
      System.out.println(sb.toString());
  }

  public int getCargaTotal() {
      int cargaTotal = locomotora.getCargaActual();

      for (Vagon vagon : vagones) {
          cargaTotal += vagon.getCargaActual();
      }

      return cargaTotal;
  }

}
