import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alumno {

    private String nombre;
    private String dni;
    private Map<String, Double> notas;

    @JsonCreator
    public Alumno(@JsonProperty("nombre") String nombre,   @JsonProperty("dni") String dni, @JsonProperty("notas") Map<String, Double> notas) {
        this.nombre = nombre;
        this.dni = dni;
        this.notas = notas;
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

    @JsonProperty("dni")
    public String getDni() {
        return dni;
    }

    @JsonProperty("dni")
    public void setDni(String dni) {
        this.dni = dni;
    }

    @JsonProperty("notas") 
    public Map<String, Double> getNotas() {
        return notas;
    }

    @JsonProperty("notas") 
    public void setNotas(Map<String, Double> notas) {
        this.notas = notas;
    }

    public double getNotaMedia() {
        double suma = 0.0;
        int contador = 0;
        for (double nota : notas.values()) {
            suma += nota;
            contador++;
        }
        return contador > 0 ? suma / contador : 0.0;
    }    

    public String toString() {
        return "Alumno: " + nombre + ", DNI: " + dni + ", Nota Media: " + getNotaMedia();
    }

}