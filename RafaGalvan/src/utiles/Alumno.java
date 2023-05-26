import java.util.List;

public class Alumno {
    private String nombre;
    private String dni;
    private List<NotaAsignatura> notas;

    public Alumno(String nombre, String dni, List<NotaAsignatura> notas) {
        this.nombre = nombre;
        this.dni = dni;
        this.notas = notas;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<NotaAsignatura> getNotas() {
        return notas;
    }

    public void setNotas(List<NotaAsignatura> notas) {
        this.notas = notas;
    }
}