import java.util.Objects;
import java.util.List;

public class Jefe extends Empleado {

   private String nombre;
   private String apellidos;
   private int edad;
   private int salario;
   private String dni;
   private Contraseña contraseña;
   private Sede sede;
   private int contadorSede;
   private List<Empleado> empleados;


   //CREAMOS LOS CONSTRUCTORES

   public Jefe(String nombre, String apellidos, int edad, int salario, String dni)
   {
        super(nombre, apellidos, edad, salario, dni);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario =  salario;
        this.dni = dni;
        this.contraseña = new Contraseña(8);
        this.empleados = FrioMijas.addEmpleado();
        contadorSede++;
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
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

    public void generaPassword() {
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
