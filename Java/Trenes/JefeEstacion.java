package Trenes;

class JefeEstacion {
   
      String nombre;
      String dni;
      int[][] fechaCargo;
   
      //CREAMOS LOS CONSTRUCTORES
   
      public JefeEstacion()
      {
          nombre = "Desconocido";
      }
   
      public JefeEstacion(String nombre)
      {
         this.nombre = nombre;
      }
   
      public JefeEstacion(String nombre, String dni, int fechaCargo)
      {
         this.nombre = nombre;
         this.dni = dni;
         this.fechaCargo = fechaCargo;
      }

      void ModificarFechaCargo(String fechaCargo)
      {
         ModificarFechaCargo(fechaCargo);
      }
   }
