package Java.Municipios;

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
    public int compareTo(Municipio o) {
        if (this.nombre.equals(o.nombre)) {
            return this.año - o.año;
        } else {
            return this.nombre.compareTo(o.nombre);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) obj;
        return this.nombre.equals(other.nombre) && this.año == other.año;
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode() + this.año;
    }

    @Override
    public String toString() {
        return this.nombre + " (" + this.año + "): " + this.poblacion;
    }

}

