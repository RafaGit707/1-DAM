package Programacion.Java.Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    
    private final int MAX_PERSONAS = 200;
    private final int MAX_ITERACIONES = 300;
    private final int MAX_NUEVAS_PERSONAS = 5;
    private final int MAX_ITERACIONES_INFECTAR = 2;
    private final int MAX_ITERACIONES_ELIMINAR_SMITH = 5;
    private final int MAX_ITERACIONES_CAMBIAR_POSICION_NEO = 5;
    private final int MAX_ITERACIONES_NUEVO_PERSONAJE_GENERICO = 30;
    private final int MAX_CAPACIDAD_INFECCION_AGENTE_SMITH = 10;

    private Personaje[] personajes;
    private Smith smith;
    private Neo neo;
    private List<Personaje> personasGenericas;
    private List<Personaje> virusSmith;

    public Matrix() {
        personajes = new Personaje[25];
        smith = null;
        neo = null;
        personasGenericas = FactoriaPersonas(MAX_PERSONAS);
        virusSmith = new ArrayList<>();
    }

    public void iniciarJuego() {
        System.out.println("===== ¡Comienza el juego de Matrix! =====");

        // Se colocan a Neo y Smith en posiciones aleatorias
        int posicionNeo = Utils.generarNumeroAleatorio(0, 24);
        int posicionSmith = Utils.generarNumeroAleatorio(0, 24);
        while (posicionSmith == posicionNeo) {
            posicionSmith = Utils.generarNumeroAleatorio(0, 24);
        }
        neo = new Neo(posicionNeo);
        personajes[posicionNeo] = neo;
        smith = new Smith(posicionSmith);
        personajes[posicionSmith] = smith;

        // Se llenan el resto de posiciones con personajes genéricos
        for (int i = 0; i < 25; i++) {
            if (personajes[i] == null) {
                Personaje personajeGenerico = obtenerPersonajeGenerico();
                personajes[i] = personajeGenerico;
            }
        }

        int iteracionActual = 1;

        while (iteracionActual <= MAX_ITERACIONES) {
            System.out.println("\n\n===== Iteración " + iteracionActual + " =====");

            // Se evalúa el porcentaje de morir de un personaje
            for (int i = 0; i < 25; i++) {
                if (personajes[i] instanceof Persona) {
                    Persona persona = (Persona) personajes[i];
                    double probabilidadMorir = Utils.generarNumeroAleatorio(0, 100);
                    if (probabilidadMorir <= persona.getProbabilidadMorir()) {
                        System.out.println("La persona " + persona.getId() + " ha muerto");
                        personajes[i] = obtenerPersonajeGenerico();
                    } else {
                        persona.setProbabilidadMorir(persona.getProbabilidadMorir() - 10);
                    }
                }
            }

            // Cada 2 iteraciones, el agente Smith infecta personajes
            if (iteracionActual % MAX_ITERACIONES_INFECTAR == 0) {
                int capacidadInfeccion = Utils.generarNumeroAleatorio(1, MAX_CAPACIDAD_INFECCION_AGENTE_SMITH);
                smith.setCapacidadInfeccion(capacidadInfeccion);
                System.out.println("El agente Smith tiene una capacidad de infección de " + capacidadInfeccion);
                            // Se infectan personajes aleatorios
            List<Personaje> personasNoInfectadas = obtenerPersonajesNoInfectados();
            Collections.shuffle(personasNoInfectadas);
            int personasInfectadas = 0;
            for (Personaje personaje : personasNoInfectadas) {
                if (personaje instanceof Persona) {
                    Persona persona = (Persona) personaje;
                    if (personasInfectadas < capacidadInfeccion) {
                        persona.setInfectado(true);
                        virusSmith.add(personaje);
                        personasInfectadas++;
                        System.out.println("La persona " + persona.getId() + " ha sido infectada por el virus de Smith");
                    } else {
                        break;
                    }
                }
            }
        }

        // Cada 5 iteraciones, se elimina un agente Smith y se genera uno nuevo
        if (iteracionActual % MAX_ITERACIONES_ELIMINAR_SMITH == 0) {
            if (virusSmith.size() > 0) {
                int indiceEliminar = Utils.generarNumeroAleatorio(0, virusSmith.size() - 1);
                Personaje personaEliminar = virusSmith.get(indiceEliminar);
                if (personaEliminar instanceof Persona) {
                    Persona persona = (Persona) personaEliminar;
                    persona.setInfectado(false);
                    virusSmith.remove(persona);
                    System.out.println("El virus de Smith ha sido eliminado de la persona " + persona.getId());
                }
            }
            smith = generarAgenteSmith();
            System.out.println("Se ha generado un nuevo agente Smith en la posición " + smith.getPosicion());
        }

        // Cada 10 iteraciones, se cambia la posición de Neo
        if (iteracionActual % MAX_ITERACIONES_CAMBIAR_POSICION_NEO == 0) {
            int nuevaPosicionNeo = Utils.generarNumeroAleatorio(0, 24);
            while (nuevaPosicionNeo == neo.getPosicion()) {
                nuevaPosicionNeo = Utils.generarNumeroAleatorio(0, 24);
            }
            personajes[neo.getPosicion()] = null;
            neo.setPosicion(nuevaPosicionNeo);
            personajes[nuevaPosicionNeo] = neo;
            System.out.println("Neo se ha movido a la posición " + neo.getPosicion());
        }

        // Cada 30 iteraciones, se genera un nuevo personaje genérico y se elimina uno existente
        if (iteracionActual % MAX_ITERACIONES_NUEVO_PERSONAJE_GENERICO == 0) {
            Personaje personajeEliminar = obtenerPersonajeGenerico();
            int nuevaPosicion = Utils.generarNumeroAleatorio(0, 24);
            while (personajes[nuevaPosicion] != null) {
                nuevaPosicion = Utils.generarNumeroAleatorio(0, 24);
            }
            personajes[nuevaPosicion] = personajeEliminar;
            System.out.println("Se ha generado un nuevo personaje genérico en la posición " + nuevaPosicion);
        }

        // Se mueven los personajes
        moverPersonajes();

        // Se muestra la matriz con la ubicación de los personajes
        mostrarMatriz();

        iteracionActual++;
    }

    System.out.println("\n\n===== ¡Fin del juego! =====");
}

private List<Personaje> FactoriaPersonas(int MAX_PERSONAS) {
    List<Personaje> personajes = new ArrayList<>();
    for (int i = 0; i < MAX_PERSONAS; i++) {
        int tipoPersonaje = Utils.generarNumeroAleatorio(0, 


}
