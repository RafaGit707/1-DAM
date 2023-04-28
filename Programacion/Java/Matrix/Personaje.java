package Java.Matrix;

import java.util.Random;

public abstract class Personaje {
    
    private static final Random random = new Random();

    private int id;
    private String nombre;
    private String ciudadNacimiento;
    private String fechaCreacion;
    private int edad;
    private int probabilidadMorir;
    private int posicion;

    public Personaje(int id, String nombre, String ciudadNacimiento, String fechaCreacion, int edad, int probabilidadMorir) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadNacimiento = ciudadNacimiento;
        this.fechaCreacion = fechaCreacion;
        this.edad = 0;
        this.probabilidadMorir = random.nextInt(101);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getProbabilidadMorir() {
        return probabilidadMorir;
    }

    public void setProbabilidadMorir(int probabilidadMorir) {
        this.probabilidadMorir = probabilidadMorir;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public abstract String mostrarInformacion();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nombre: " + nombre +
                ", Ciudad de Nacimiento: " + ciudadNacimiento +
                ", Fecha de Creación: " + fechaCreacion +
                ", Edad: " + edad +
                ", Probabilidad de Morir: " + probabilidadMorir + "%";
    }
}
