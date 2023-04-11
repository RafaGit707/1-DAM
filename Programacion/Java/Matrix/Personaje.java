package Programacion.Java.Matrix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Personaje {
    private static final Random RANDOM = new Random();
    private static final String[] CIUDADES = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
    private static final String[] NOMBRES = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private int id;
    private String nombre;
    private String ciudadNacimiento;
    private LocalDateTime fechaCreacion;
    private int edad;
    private int probabilidadMorir;

    public Personaje(int id) {
        this.id = id;
        this.nombre = NOMBRES[RANDOM.nextInt(NOMBRES.length)];
        this.ciudadNacimiento = CIUDADES[RANDOM.nextInt(CIUDADES.length)];
        this.fechaCreacion = LocalDateTime.now();
        this.edad = 0;
        this.probabilidadMorir = RANDOM.nextInt(101);
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

    public LocalDateTime getFechaCreacion() {
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

    public abstract void mostrarInformacion();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nombre: " + nombre +
                ", Ciudad de Nacimiento: " + ciudadNacimiento +
                ", Fecha de Creación: " + fechaCreacion.format(DATE_FORMATTER) +
                ", Edad: " + edad +
                ", Probabilidad de Morir: " + probabilidadMorir + "%";
    }
}
