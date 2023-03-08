import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Sede {

   private String nombre;
   private String direccion;
   private int codPostal;
   private Jefe jefe;
   private static int contadorSede = 0;
   private int codigoSede;
   private List<EquipoFrigorifico> equiposFrigorificos;

   public Sede(String nombre, String direccion, int codPostal) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.codPostal = codPostal;
   }
   public Sede(String nombre, String direccion, int codPostal, Jefe jefe) {
      this.nombre = nombre;
      this.direccion = direccion;
      this.codPostal = codPostal;
      this.codigoSede = ++contadorSede;
      this.jefe = jefe;
      this.equiposFrigorificos = new ArrayList<>();
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

   public int getCodigoSede() {
      return codigoSede;
   }

   public void addEmpleado(Empleado empleado) {
      if (!empleados.contains(empleado)) {
          empleados.add(empleado);
          empleado.setSede(this);
      }

   }
   public List<EquipoFrigorifico> getEquiposFrigorificos() {
      return equiposFrigorificos;
  }

  public void addEquipoFrigorifico(EquipoFrigorifico equipoFrigorifico) {
      this.equiposFrigorificos.add(equipoFrigorifico);
  }

  public double calcularConsumoTotal() {
      double consumoTotal = 0;
      for (EquipoFrigorifico equipo : equiposFrigorificos) {
          consumoTotal += equipo.calcularConsumo();
      }
      return consumoTotal;
  }
}
