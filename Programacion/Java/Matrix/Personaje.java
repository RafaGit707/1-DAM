package Java.Matrix;

import java.util.List;
import java.util.Random;

public abstract class Personaje {
    
    private static final Random random = new Random();
    protected static final String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
    private static final String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};

    private int id;
    private String nombre;
    private String ciudadNacimiento;
    private String fechaCreacion;
    private int edad;
    private int probabilidadMorir;
    private int posicion;

    public Personaje(int id, String nombre, String ciudadNacimiento, String fechaCreacion, int edad, int probabilidadMorir) {
        this.id = id;
        this.nombre = nombres[random.nextInt(nombres.length)];
        this.ciudadNacimiento = ciudades[random.nextInt(ciudades.length)];
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

    List<Personaje> personas = FactoriaPersonas.crearPersonas(200);
}
