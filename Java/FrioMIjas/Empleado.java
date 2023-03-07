import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private static int contador = 1;
    private String nombre;
    private String apellidos;
    private int edad;
    private int salario;
    private String dni;
    private int id;
    private Sede sede;

    public Empleado(String nombre, String apellidos, int edad, int salario, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
        this.dni = dni;
        this.id = contador++;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        if (sede == null) {
            throw new IllegalArgumentException("La sede no puede ser nula");
        }

        if (sede.tieneEmpleadoConDni(dni)) {
            throw new IllegalArgumentException("Ya existe un empleado con ese DNI en la sede");
        }

        this.sede = sede;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return dni.equals(empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                '}';
    }


      
}
