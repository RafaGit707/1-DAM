package Java;

import java.time.LocalDate;

class persona {
   
   String dni;
   String nombre;
   String apellidos;
   int edad;
   double estatura;

   static String hoy;

   public Persona()
   {
      nombre = "Desconocido";
   }

   public Persona(String nombrePersona, int añoNacimiento, String dni)
   {
      this.nombre = nombrePersona;
      fechaNAcimiento = LocalDate.of(añoNacimiento, 1, 1);
      this.dni = dni;
   }


}
