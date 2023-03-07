public class Sede {

   private String nombre;
   private String direccion;
   private int codPostal;

   public Sede(String nombre, String direccion, int codPostal) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.codPostal = codPostal;
   }
   public Sede(String nombre, String direccion, int codPostal, Jefe jefe) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.codPostal = codPostal;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   public void setJefe(Jefe jefe)
    {
      setJefe(jefe);
    }

}
