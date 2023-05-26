import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Profesor {

    private String nombre;
    private String codigo;
    private String especialidad;
    private List<Alumno> alumnos;

    @JsonCreator
    public Profesor(@JsonProperty("nombre") String nombre, @JsonProperty("codigo") String codigo, @JsonProperty("especialidad") String especialidad, @JsonProperty("alumnos") List<Alumno> alumnos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.alumnos = alumnos;
    }

    // Getters y setters

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("especialidad")
    public String getEspecialidad() {
        return especialidad;
    }

    @JsonProperty("especialidad")
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @JsonProperty("alumnos")
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @JsonProperty("alumnos")
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

}