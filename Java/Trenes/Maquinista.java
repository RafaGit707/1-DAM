package Trenes;

class Maquinista {
   
   private String nombre;
   private String dni;
   private double sueldo;
   private String rango;

   //CREAMOS LOS CONSTRUCTORES

   public Maquinista(String nombre, String dni, double sueldo) {
       this.nombre = nombre;
       this.dni = dni;
       this.sueldo = sueldo;
       this.rango = "Ayudante";
   }
   
   public Maquinista(String nombre, String dni,double sueldo, String rango)
   {
      this.nombre = nombre;
      this.dni = dni;
      this.sueldo = sueldo;
      this.rango = rango;
   }
    public String getNombre()
    {
        return nombre;
    }

    public String getDni()
    {
        return dni;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public String getRango()
    {
        return rango;
    }

    public void setRango(String rango)
    {
        this.rango = rango;
    }
    
}

