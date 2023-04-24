package Java.Matrix;

import java.util.ArrayList;
import java.util.Random;

public class Matrix {
    
    private ArrayList<Personaje> personajes;
    private static Matrix instancia;

    private Matrix() {
        personajes = new ArrayList<>();
    }

    public static Matrix getInstance() {
        if (instancia == null) {
            instancia = new Matrix();
        }
        return instancia;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void eliminarPersonaje(Personaje personaje) {
        personajes.remove(personaje);
    }

    public static void reemplazarPersonaje(Personaje original, Personaje reemplazo) {
        Matrix.getInstance().eliminarPersonaje(original);
        Matrix.getInstance().agregarPersonaje(reemplazo);
    }

    public void mostrarInformacion() {
        System.out.println("La Matrix contiene los siguientes personajes:");
        for (Personaje personaje : personajes) {
            personaje.mostrarInformacion();
        }
    }

    public void simularAtaque() {
        Random random = new Random();
        int posicionNeo = random.nextInt(personajes.size());
        Neo neo = (Neo) personajes.get(posicionNeo);
        neo.atacarSmiths(personajes);
        int cantidadSmiths = 0;
        for (Personaje personaje : personajes) {
            if (personaje instanceof Smith) {
                cantidadSmiths++;
                if (cantidadSmiths > 1) {
                    Smith smith = (Smith) personaje;
                    int indice = random.nextInt(personajes.size());
                    Personaje victima = personajes.get(indice);
                    smith.infectar(victima);
                }
            }
        }
    }
}
