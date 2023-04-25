package Java.Matrix;

import java.util.ArrayList;
import java.util.Random;

public class Matrix {

    private ArrayList<Personaje> personajes;
    private Random random;

    public Matrix() {
        personajes = new ArrayList<>();
        random = new Random();
    }


    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void eliminarPersonaje(Personaje personaje) {
        personajes.remove(personaje);
    }

    public void mostrarInformacionPersonajes() {
        System.out.println("Información de los personajes:");
        for (Personaje personaje : personajes) {
            personaje.mostrarInformacion();
        }
    }

    public void simularAtaque() {
        System.out.println("Simulando ataque a la Matrix...");
        ArrayList<Personaje> copiaPersonajes = new ArrayList<>(personajes);
        for (Personaje personaje : copiaPersonajes) {
            if (personaje instanceof Neo) {
                ((Neo) personaje).atacarSmiths(personajes);
            } else if (personaje instanceof Smith) {
                int index = random.nextInt(personajes.size());
                Personaje objetivo = personajes.get(index);
                ((Smith) personaje).infectar(objetivo);
            }
        }
    }

    public static void reemplazarPersonaje(Personaje viejoPersonaje, Personaje nuevoPersonaje) {
        
        Matrix matrix = new Matrix();
        ArrayList<Personaje> personajes = matrix.getPersonajes();

        int index = personajes.indexOf(viejoPersonaje);
        if (index >= 0) {
            personajes.set(index, nuevoPersonaje);
            System.out.println(viejoPersonaje.getNombre() + " ha sido reemplazado por " + nuevoPersonaje.getNombre() + " en la Matrix.");
        }
    }


    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        Neo neo = new Neo(1, "Thomas Anderson", "Metacortex", "12:00", 29, 10, true, 50, 0);
        matrix.agregarPersonaje(neo);

        Smith agente1 = new Smith(2, "Agente Smith", "Desconocida", "12:00", 0, 0, 70);
        matrix.agregarPersonaje(agente1);

        Smith agente2 = new Smith(3, "Agente Smith", "Desconocida", "12:00", 0, 0, 70);
        matrix.agregarPersonaje(agente2);

        Smith agente3 = new Smith(4, "Agente Smith", "Desconocida", "12:00", 0, 0, 70);
        matrix.agregarPersonaje(agente3);

        DepositoVirus.inicializarDepositoVirus();

        matrix.mostrarInformacionPersonajes();
        System.out.println();

        matrix.simularAtaque();
        System.out.println();

        matrix.mostrarInformacionPersonajes();
        DepositoVirus.mostrarInformacionVirus();
    }
}
