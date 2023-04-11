package Programacion.Java.Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
                // Se infectan
                // Se verifica si hay personajes cercanos al agente Smith y se agregan a la lista de virus
                for (int i = 0; i < 25; i++) {
                    if (personajes[i] != null && personajes[i] instanceof Persona) {
                    Persona persona = (Persona) personajes[i];
                    if (Utils.calcularDistancia(persona.getPosicion(), smith.getPosicion()) <= smith.getRadioInfeccion()) {
                    System.out.println("El agente Smith ha infectado a la persona " + persona.getId());
                    virusSmith.add(persona);
                    }
                    }
                }
            }
            // Se evalúa si el agente Smith debe ser eliminado
            if (virusSmith.size() >= MAX_CAPACIDAD_INFECCION_AGENTE_SMITH) {
                System.out.println("El agente Smith ha sido eliminado");
                virusSmith.clear();
                int posicionNuevaSmith = Utils.generarNumeroAleatorio(0, 24);
                while (personajes[posicionNuevaSmith] instanceof Agente) {
                    posicionNuevaSmith = Utils.generarNumeroAleatorio(0, 24);
                }
                personajes[smith.getPosicion()] = null;
                smith.setPosicion(posicionNuevaSmith);
                personajes[posicionNuevaSmith] = smith;
            }

            // Se evalúa si Neo debe cambiar de posición
            if (iteracionActual % MAX_ITERACIONES_CAMBIAR_POSICION_NEO == 0) {
                int nuevaPosicion = Utils.generarNumeroAleatorio(0, 24);
                while (personajes[nuevaPosicion] instanceof Agente) {
                    nuevaPosicion = Utils.generarNumeroAleatorio(0, 24);
                }
                personajes[neo.getPosicion()] = null;
                neo.setPosicion(nuevaPosicion);
                personajes[nuevaPosicion] = neo;
            }

            // Se evalúa si se deben agregar nuevos personajes genéricos
            if (iteracionActual % MAX_ITERACIONES_NUEVO_PERSONAJE_GENERICO == 0) {
                int cantidadNuevasPersonas = Utils.generarNumeroAleatorio(1, MAX_NUEVAS_PERSONAS);
                for (int i = 0; i < cantidadNuevasPersonas; i++) {
                    Personaje personajeGenerico = obtenerPersonajeGenerico();
                    int posicionNuevaPersona = Utils.generarNumeroAleatorio(0, 24);
                    while (personajes[posicionNuevaPersona] != null) {
                        posicionNuevaPersona = Utils.generarNumeroAleatorio(0, 24);
                    }
                    personajes[posicionNuevaPersona] = personajeGenerico;
                }
            }

            // Se evalúa si se deben eliminar personajes genéricos para dar lugar a nuevos personajes
            int cantidadPersonas = 0;
            for (int i = 0; i < 25; i++) {
                if (personajes[i] instanceof Persona) {
                    cantidadPersonas++;
                }
            }
            if (cantidadPersonas >= MAX_PERSONAS) {
                System.out.println("Se deben eliminar personajes para dar lugar a nuevos");
                int cantidadPersonasAEliminar = cantidadPersonas - MAX_PERSONAS + Utils.generarNumeroAleatorio(0, 5);
                for (int i = 0; i < cantidadPersonasAEliminar; i++) {
                    int posicionAEliminar = Utils.generarNumeroAleatorio(0, 24);
                    while (personajes[posicionAEliminar] == null || personajes[posicionAEliminar] instanceof Agente

    
    
    