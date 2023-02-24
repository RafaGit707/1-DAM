package Trenes;

class Locomotora {

   private int cargaActual;
   private String matricula;
   private int potencia;
   private int antiguedad;
   private Mecanico mecanico;

   public Locomotora(String matricula, int potencia) {
       this.matricula = matricula;
       this.potencia = potencia;
       this.antiguedad = 0;
   }

   public Locomotora(String matricula, int potencia, int antiguedad) {
       this.matricula = matricula;
       this.potencia = potencia;
       this.antiguedad = antiguedad;
   }

   public int getCargaActual() {
      return cargaActual;
  }

   public String getMatricula() {
       return matricula;
   }

   public int getPotencia() {
       return potencia;
   }

   public int getAntiguedad() {
       return antiguedad;
   }

   public Mecanico getMecanico() {
       return mecanico;
   }

   public void asignarMecanico(Mecanico mecanico) {
       this.mecanico = mecanico;
   }

   @Override
   public String toString() {
       String info = "Locomotora: " + matricula + " (" + potencia + "Cv)";
       if (mecanico != null) {
           info += " - Mecanico: " + mecanico.getNombre();
       }
       return info;
   }
}
