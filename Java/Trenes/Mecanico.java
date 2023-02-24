package Trenes;

public class Mecanico {
   
   private String nombre;
   private String tlf;
   private String especialidad;

   public Mecanico(String nombre, String tlf, String especialidad)
   {
       this.nombre = nombre;
       this.tlf = tlf;
       this.especialidad = especialidad;
   }

   public String getNombre() {
       return nombre;
   }

   public String getTlf() {
       return tlf;
   }

   public String getEspecialidad() {
       return especialidad;
   }
   public String toString() {
      return nombre + " (Tlf: " + tlf + ") especialista en " + especialidad;
  }
}
