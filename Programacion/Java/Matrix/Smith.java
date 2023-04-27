package Java.Matrix;

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
                System.out.println(this.getNombre() + " ha infectado a " + personaje.getNombre());
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
    public String mostrarInformacion() {
        String info = "ID: " + getId() + "\n" +
                  "Nombre: " + getNombre() + "\n" +
                  "Ciudad de nacimiento: " + getCiudadNacimiento() + "\n" +
                  "Fecha y hora de creación: " + getFechaCreacion() + "\n" +
                  "Edad: " + getEdad() + "\n" +
                  "Probabilidad de morir: " + getProbabilidadMorir() + "\n" +
                  "Capacidad de infección: " + getCapacidadInfeccion() + "\n\n";
    return info;
    }
}
