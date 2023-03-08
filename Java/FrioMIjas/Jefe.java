import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Jefe extends Empleado {

   private String nombre;
   private String apellidos;
   private int edad;
   private int salario;
   private String dni;
   private int empleados;
   private Contraseña contraseña;
   private Sede sede;
   public int contador;

   //CREAMOS LOS CONSTRUCTORES

   public Jefe(String nombre, String apellidos, int edad, int salario, String dni)
   {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;
      this.salario =  salario;
      this.dni = dni;
      this.empleados = FrioMijas.addEmpleado();
      contador++;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int addEmpleado() {
        return empleados;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
    public boolean esFuerte() {
      return contraseña.esFuerte();
  }

  public void generaPassword(Contraseña longitud) {
      contraseña.generaPassword();
  }

  public String getContraseña() {
      return contraseña.getContraseña();
  }

  public void cambiarContraseña(int longitud) {
      contraseña = new Contraseña(longitud);
  }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jefe other = (Jefe) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    

}
