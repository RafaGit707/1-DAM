package Trenes;

class Maquinista {
   
   String nombre;
   String dni;
   double sueldo;
   String rango;

   //CREAMOS LOS CONSTRUCTORES

   public Maquinista()
   {
       nombre = "Desconocido";
   }

   public Maquinista(String nombre)
   {
      this.nombre = nombre;
   }

   public Maquinista(String nombre, String dni,double sueldo, String rango)
   {
      this.nombre = nombre;
      this.dni = dni;
      this.sueldo = sueldo;
      this.rango = rango;
   }
   void setRango(String rango)
    {
        setRango(rango);
    }
}
