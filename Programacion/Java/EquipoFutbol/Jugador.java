package Java.EquipoFutbol;

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO;
}

class Jugador {
    private String dni;
    private String nombre;
    private Posicion posicion;
    private int estatura;

    public Jugador(String dni, String nombre, Posicion posicion, int estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
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

    public int getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Posicion: " + posicion + ", Estatura: " + estatura;
    }


}