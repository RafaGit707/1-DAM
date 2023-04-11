package Programacion.Java.Matrix;

import java.time.LocalDateTime;
import java.util.Random;

public class Smith extends Personaje {

    private int capacidadInfeccion;

    public Smith(int id, String nombre, String ciudadNacimiento, String fechaCreacion, int edad, int probabilidadMorir, int capacidadInfeccion) {
        super(id, nombre, ciudadNacimiento, fechaCreacion, edad, probabilidadMorir);
        this.capacidadInfeccion = capacidadInfeccion;
    }

    public int getCapacidadInfeccion() {
        return capacidadInfeccion;
    }

    public void setCapacidadInfeccion(int capacidadInfeccion) {
        this.capacidadInfeccion = capacidadInfeccion;
    }

    public void infectar(Personaje personaje) {
        if (!(personaje instanceof Smith)) {
            Random random = new Random();
            int numAleatorio = random.nextInt(101);
            if (numAleatorio <= capacidadInfeccion) {
                System.out.println("El agente Smith " + this.getNombre() + " ha infectado a " + personaje.getNombre());
                Smith nuevoSmith = new Smith(personaje.getId(), personaje.getNombre(), personaje.getCiudadNacimiento(), "12:00", 0, 0, capacidadInfeccion);
                Matrix.reemplazarPersonaje(personaje, nuevoSmith);
            }
        }
    }

    @Override
    public String toString() {
        return "S(" + getId() + ")";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ciudad de nacimiento: " + getCiudadNacimiento());
        System.out.println("Fecha y hora de creación: " + getFechaHoraCreacion());
        System.out.println("Edad: " + getEdad());
        System.out.println("Probabilidad de morir: " + getProbabilidadMorir());
        System.out.println("Capacidad de infección: " + capacidadInfeccion);
        System.out.println();
    }
