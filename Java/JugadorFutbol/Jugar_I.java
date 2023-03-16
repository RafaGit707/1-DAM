package Java.JugadorFutbol;

// Interfaz Jugar_I
public interface Jugar_I {
    void hacerGol();
    void cometerFalta();
}

// Clase Jugador implementando Comparable y el interfaz Jugar_I
public class Jugador implements Comparable<Jugador>, Jugar_I {

    private static int contadorLicencia = 1000; // para generar número de licencia único

    private String nombre;
    private String apodo;
    private int numLicencia;
    private int numeroGoles;
    private int numeroFaltas;

    // Constructor para generar automáticamente el número de licencia
    public Jugador(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numLicencia = ++contadorLicencia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
   
    }

    // Métodos de la interfaz Jugar_I
@Override
public void hacerGol() {
    this.numeroGoles++;
    System.out.println(this.nombre + " ha marcado un gol.");
}

@Override
public void cometerFalta() {
    this.numeroFaltas++;
    System.out.println(this.nombre + " ha cometido una falta.");
}

// Método toString()
@Override
public String toString() {
    return nombre + " (" + apodo + ") - Goles " + numeroGoles + " - Faltas " + numeroFaltas;
}

// Método equals() comparando por número de licencia
@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (!(obj instanceof Jugador)) {
        return false;
    }
    Jugador jugador = (Jugador) obj;
    return this.numLicencia == jugador.getNumLicencia();
}


}