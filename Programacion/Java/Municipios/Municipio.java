package Java.Municipios;

import java.util.Objects;

public class Municipio implements Comparable<Municipio> {

    private String codigoPostal;
    private String nombre;
    private int año;
    private int poblacion;

    public Municipio(String codigoPostal, String nombre, int año, int poblacion) {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.año = año;
        this.poblacion = poblacion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return nombre + " (" + año + ") : " + poblacion;
    }

    @Override
    public int compareTo(Municipio o) {
        if (nombre.equals(o.nombre)) {
            return año - o.año;
        }
        return nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Municipio municipio = (Municipio) o;
        return año == municipio.año && Objects.equals(nombre, municipio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, año);
    }
}

