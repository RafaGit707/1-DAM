package Trenes;

import java.time.LocalDate;

class JefeEstacion {
   
      private String nombre;
      private String dni;
      private LocalDate fechaCargo;
   
      //CREAMOS LOS CONSTRUCTORES
   
      public JefeEstacion()
      {
          nombre = "Desconocido";
      }
   
      public JefeEstacion(String nombre, String dni)
      {
         this.nombre = nombre;
         this.dni = dni;
      }
   
      public JefeEstacion(String nombre, String dni, LocalDate fechaCargo)
      {
         this.nombre = nombre;
         this.dni = dni;
         this.fechaCargo = null;
      }

      public void ModificarFechaCargo(int año, int mes, int dia)
      {
         this.fechaCargo = LocalDate.of(año, mes, dia);
      }
      public String getNombre() {
         return nombre;
     }
  
     public String getDni() {
         return dni;
     }
  
     public LocalDate getFechaCargo() {
         return fechaCargo;
     }
  
     public String toString()
     {
         if (this.fechaCargo == null)
         {
             return "Jefe de estacion: " + this.nombre + " - DNI: " + this.dni + " - Fecha de nombramiento: No disponible";
         }
         else
         {
             return "Jefe de estacion: " + this.nombre + " - DNI: " + this.dni + " - Fecha de nombramiento: " + this.fechaCargo;
         }
     }
}
