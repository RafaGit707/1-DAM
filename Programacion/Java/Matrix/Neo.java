package Java.Matrix;

import java.util.ArrayList;

public class Neo extends Personaje {

    private boolean esElegido;
    private int capacidadDestruccion;
    private int posicion;

    public Neo(int id, String nombre, String ciudadNacimiento, String fechaCreacion, int edad, int probabilidadMorir, boolean esElegido, int capacidadDestruccion, int posicion) {
        super(id, nombre, ciudadNacimiento, fechaCreacion, edad, probabilidadMorir);
        this.esElegido = esElegido;
        this.capacidadDestruccion = capacidadDestruccion;
        this.posicion = posicion;
    }

    public boolean esElegido() {
        return esElegido;
    }

    public int getCapacidadDestruccion() {
        return capacidadDestruccion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setEsElegido(boolean esElegido) {
        this.esElegido = esElegido;
    }

    public void setCapacidadDestruccion(int capacidadDestruccion) {
        this.capacidadDestruccion = capacidadDestruccion;
    }

    public void atacarSmiths(ArrayList<Personaje> personajes) {
        ArrayList<Personaje> smiths = new ArrayList<>();
        // Busca a los Smiths en un radio de capacidadDestruccion
        for (Personaje personaje : personajes) {
            if (personaje instanceof Smith) {
                int distancia = Math.abs(personaje.getPosicion() - this.getPosicion());
                if (distancia <= this.capacidadDestruccion) {
                    smiths.add(personaje);
                }
            }
        }
        // Elimina a los Smiths y los añade al depósito de virus
        if (!smiths.isEmpty()) {
            System.out.println("Neo ha eliminado a los siguientes Smiths:");
            for (Personaje smith : smiths) {
                System.out.println(smith.mostrarInformacion());
                personajes.remove(smith);
            }
            Smith virus = new Smith(smiths.get(0).getId(), "Virus Smith", "Desconocida", "12:00", 0, 0, 100);
            DepositoVirus.agregarVirus(virus);
        } else {
            System.out.println("Neo no ha encontrado ningún Smith para atacar.");
        }
    }

    @Override
    public String mostrarInformacion() {
        String tipo = esElegido ? "Neo (Elegido)" : "Neo";
        return String.format("%s - %s - Capacidad de destrucción: %d", tipo, super.mostrarInformacion(), capacidadDestruccion);
    }
}
