package Java.EquipoFutbol;

import java.util.Scanner;

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO;
}

class Jugador {
    private String dni;
    private String nombre;
    private Posicion posicion;
    private double estatura;

    public Jugador(String dni, String nombre, Posicion posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }
    public Jugador () {

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Posicion: " + posicion + ", Estatura: " + estatura;
    }

    public void editarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nuevo nombre del jugador:");
        nombre = sc.nextLine();
        System.out.println("Introduce la posición del jugador (portero, defensa, centrocampista, delantero):");
        String posicionStr = sc.nextLine();
        switch (posicionStr.toLowerCase()) {
            case "portero":
                posicion = Posicion.PORTERO;
                break;
            case "defensa":
                posicion = Posicion.DEFENSA;
                break;
            case "centrocampista":
                posicion = Posicion.CENTROCAMPISTA;
                break;
            case "delantero":
                posicion = Posicion.DELANTERO;
                break;
            default:
                System.out.println("Posición no válida. Se asignará la posición por defecto de defensa.");
                posicion = Posicion.DEFENSA;
                break;
        }
        System.out.println("Introduce la nueva altura del jugador:");
        estatura = sc.nextDouble();
        sc.close();
    }

}